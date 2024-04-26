import java.util.Scanner;

public class MultipleOperations {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		MultipleOperations mo = new MultipleOperations();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("Enter your choice from below list. \n"
					+ "1. Check if numnber is Palindrome.\n" 
					+ "2. Print Pattern for a given no.\n" 
					+ "3. Check if number is prime.\n"
					+ "4. Print Fibonacci Series.\n"
					+ "5. Print Factorial.\n"
					+ "6. Print Multiplication table.\n"
					+ "--> Enter 0 to Exit.\n");
			System.out.println();
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				choice = 0;
				break;
				
			case 1:{
				mo.checkPalindrome();
			}
			break;
			
			case 2:{
				mo.printPattern();
			}
			break;
			
			case 3:{
				mo.checkPrime();
			}
			break;
			
			case 4:{
				mo.printFibonacciSeries();
			}
			break;
			
			case 5:{
				mo.printFactorial();
			}
			break;
			
			case 6:{
				mo.printMultiplicationTable();
			}
			break;
			
			default:
				System.out.println("Invalid choice. Enter a valid no. \n");
			}
			
		} while(choice != 0);
		System.out.println("Exited Successfully!!!");
		
		sc.close();
	}


	private void checkPalindrome() {
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int temp = num;
		int result = 0;
		
		while(num > 0) {
			int rem = num % 10;
			result = (result * 10) + rem;
			num = num/10;
		}		
		
		if(result == temp)
			System.out.println(temp + " is a Palindrome Number\n");
		else
			System.out.println(temp + " is not a Palindrome Number\n");
	}
	
	private void printPattern() {
		System.out.println("Enter the size of the Pattern: ");
		int size = sc.nextInt();
		
		for(int i = 1; i <= size; i++) {
			for(int j = size; j >= i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
	}
	
	private void checkPrime() {
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		int i = 2;
		boolean flag = false;
		
		while(i <= num/2) {
			if(num % i == 0) {
				flag = true;
			    break;
			}
		i++;
		}
		
		if(!flag)
			System.out.println(num + " is Prime Number\n");
		else
			System.out.println(num + " is not a Prime Number\n");
	}

	private void printFibonacciSeries() {
		int first = 0, second = 1, sum = 0;
		
		System.out.println("Enter the Value for Fibonacci Series: ");
		int value = sc.nextInt();
		
		if(value == 0)
			System.out.println("The Fibonacci Series: " + first);
		else if(value == 1)
			System.out.println("The Fibonacci Series: " + first + ", " + second);
		else {
			System.out.print("The Fibonacci Series: " + first + ", " + second);
			while(value > 1) {
				sum = first + second;
				System.out.print(", " + sum);
				first = second;
				second = sum;
				value -= 1;
			}
			System.out.println();
		}
		
	}
	
	private void printFactorial() {
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		int temp = num;
		int fact = 1;
		if(num == 0)
			fact = 1;
		else
			while(num > 0) {
				fact = fact * num;
				num--;
			}
		
		System.out.println("Factorial of " + temp + " is : " + fact + "\n");	
	}
	
	private void printMultiplicationTable() {
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		
	}
	
}
