import java.util.Scanner;

public class MergeSortPractice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array: ");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter " + size + " elements in the Array: ");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Array before sorting: ");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		
		mergeSortImplementation.mergeSort(array, 0, array.length - 1);
		
		System.out.println("\n-----------------\n");
		System.out.println("Array After sorting: ");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		
		sc.close();

	}

}
