import java.util.Scanner;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value for Fibonacci Series: ");
		int value = sc.nextInt();
		
		if(value == 0) {
			System.out.println("The Fibonacci Series: " + first);
		}
		else if(value == 1) {
			System.out.println("The Fibonacci Series: " + first + ", " + second);
		}
		else {
			System.out.print("The Fibonacci Series: " + first + ", " + second);
			
			while(value > 1) {
				sum = first + second;
				System.out.print(", " + sum);
				first = second;
				second = sum;
				value-=1;
				}
		}

	}

}
