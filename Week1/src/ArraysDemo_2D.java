import java.util.Scanner;

public class ArraysDemo_2D {

	public static void main(String[] args) {
		int arr[][] = new int[3][5];
		Scanner sc = new Scanner(System.in);
		int i,j;
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the marks for Subject for the position " + i + "," + j);
				arr[i][j] = sc.nextInt();
			}	
		}
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int sum=0;
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("Sum of the Array: " + sum);
		
		double percentage = sum/arr.length;
		
		System.out.println("Percentage: " + percentage);

	}

}
