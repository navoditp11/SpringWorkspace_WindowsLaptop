import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		int marks[] = new int[5];
		//int marks[] = {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		int i;
		
		for(i = 0; i < marks.length; i++) {
			System.out.println("Enter the marks for subject " + (i+1));
			marks[i] = sc.nextInt();
		}
		
		for(int n:marks) {
			System.out.println(n);
		}
		
		int result = 0;
		for(int n:marks) {
			result += n;
		}
		System.out.println("Sum of the Array: " + result);
		
		double percentage = result/marks.length;
		
		System.out.println("Percentage: " + percentage);
		

	}

}
