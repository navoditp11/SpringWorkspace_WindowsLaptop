package com.gl.question1;

//**Solution Write-up**:
//To solve this problem, a Stack and a Priority Queue is used. 
//The idea is to push the floor size onto the stack every day.
//We'll also push the floor size into the Priority Queue
//to keep track of the maximum floor size available on any given day. 
//Then, we'll check the maximum size from the Priority Queue and
//compare it with the total floors `N`. If they match, we'll pop 
//the maximum value from both the Stack and Priority Queue
//and decrement `N`. We'll continue to do this as long as the maximum 
//value from the Priority Queue matches `N`.

//**Code Logic**:
//This code simulates the construction of a skyscraper.
//get the inputs "Enter the total no of floors in the building: " and "Enter Floor Size given on day: ". 
//and at end output "The order of construction is as follows:"
//On each day, a floor of a certain size is constructed. 
//The program uses a stack to keep track of the floors constructed and 
//a priority queue to determine when a floor can be added to the skyscraper. 
//When a floor can be added, it is removed from the stack and priority queue, 
//and the count of total floors to be constructed is decremented. 
//The floors added to the skyscraper on each day are printed as output.

//**Condition logic**:
//a) Every day a floor is constructed in a separate factory of distinct size.
// The code prompts the user to enter the size of the floor constructed each day. 
// The loop ensures that a floor is constructed every day.
//
//b) The floor with the larger size must be placed at the bottom of the building.
// This is ensured by the use of a max heap (PriorityQueue) that always keeps track 
// of the largest floor size yet to be placed. The `while` loop inside the main loop 
// checks if the largest floor size available (`maxFloorQueue.peek()`) is equal to 
// the `totalFloors` (which represents the floor number yet to be constructed starting 
// from the bottom). If it matches, it means that floor can be placed at that level, 
// so it is dequeued and `totalFloors` is decremented.
//
//c) The floor with the smaller size must be placed at the top of the building.
// This is a consequence of condition b. Since larger floors are placed at the bottom 
// as soon as they are available, the smaller floors are naturally left to be placed 
// at the top as the `totalFloors` variable is decremented from total down to 1.
//
//Conclusion: The code ensures that the floors are built every day, and then placed
//          in the building in decreasing order of their sizes, from bottom to top, 
//          as per the conditions specified.

//**Additional Condition**:
//Note: A floor cannot be assembled in the building until all floors larger in size are placed.
//PriorityQueue: The code uses a max heap implemented by `PriorityQueue` that stores the 
//             floor sizes in such a way that the largest floor size is always at the 
//             front of the queue. This ensures that floors are always accessed 
//             in decreasing order of their sizes.
//totalFloors:   The `totalFloors` variable is initially set to `N` and is decremented 
//             each time a floor is placed in the building. It essentially represents the 
//             floor number yet to be constructed starting from the largest size.
//
//In the inner `while` loop, there is a check `maxFloorQueue.peek() == totalFloors`. 
//This checks if the largest available floor size (which is at the front of the max heap) 
//is the one that needs to be placed next in the building. If this condition is not met, 
//it means there are larger floors yet to be placed, and so the current floor cannot be placed yet.
//By these the logic ensures that a floor can only be placed in the building 
//if all the larger floors have already been placed.

//Importing classes from Java's utility package: Scanner, Stack, PriorityQueue, Comparator.
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class SkyscraperConstruction {

	public static void main(String[] args) {
		// Welcome Message
		System.out.println("Welcome Architect!"); // Print Welcome Message
		System.out.println("Proceed with construction analysis by giving the inputs: "); // Print Welcome Message
		System.out.println(""); // Print a newline

		// Create a Scanner object to read input
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the total number of floors in the building
		System.out.println("Enter the total no of floors (>=1) in the building : ");
		int N = scanner.nextInt(); // Read the total number of floors
		int totalFloors = N; // Initialize a variable to keep track of the remaining floors to be constructed

		// Create an array to store floor sizes given each day
		int[] floorSizes = new int[N];

		// Prompt the user to enter floor sizes for each day
		for (int i = 0; i < N; i++) {
			while (true) { // Use an infinite loop to keep asking for input until valid
				System.out.println("Enter the floor size given on Day: " + (i + 1) + " : ");
				int floorSize = scanner.nextInt(); // Read the floor size

				// Validate that floor size is within the allowed range
				if (floorSize >= 1 && floorSize <= N) {
					floorSizes[i] = floorSize; // Save the floor size
					break; // Break out of the loop since the input is valid
				} else {
					System.out
							.println("Invalid input. Floor size should be between 1 and " + N + ". Please try again. ");
				}
			}
		}

		// Close the Scanner object to prevent resource leak
		scanner.close();

		System.out.println("\nThe order of construction is as follows: \n");

		// Create a Stack to keep track of the floors as they are constructed
		Stack<Integer> floorsStack = new Stack<>();

		// Create a Priority Queue to keep track of the maximum floor size
		// The Comparator.reverseOrder() ensures that the Priority Queue is max heap
		PriorityQueue<Integer> maxFloorQueue = new PriorityQueue<>(Comparator.reverseOrder());

		// Loop through each day of construction using the floor sizes array
		for (int i = 0; i < N; i++) {
			int floorSize = floorSizes[i]; // Get the floor size

			// Push the floor size onto the stack and add it to the priority queue
			floorsStack.push(floorSize);
			maxFloorQueue.add(floorSize);

			// Print the current day
			System.out.print("Day: " + (i + 1) + " : " + "\n");

			// Check if the max floor size in the priority queue is the same as the current
			// total floors. If so, it means we can construct that floor and print it
			while (!maxFloorQueue.isEmpty() && maxFloorQueue.peek() == totalFloors) {
				System.out.print("Floor> " + maxFloorQueue.poll() + " "); // Print the floor size
				floorsStack.pop(); // Remove the floor size from the stack
				totalFloors--; // Decrease the total floors remaining to be constructed
			}
			System.out.println(); // Print a newline at the end
		}
		System.out.println("<<== Glad that the construction analysis was useful to you. ==>>"); // Print Bye Message
	}
}