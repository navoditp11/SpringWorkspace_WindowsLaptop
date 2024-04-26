import java.util.Scanner;

public class FindReverseOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int rem; 
		int result = 0;
		
		if(num < 0) {
			System.out.println("0");
		}
		
		while(num > 0) {
			rem = num % 10;
			result = (result * 10) + rem;
			num = num/10;
		}
		System.out.println("Reverse of a Number: " + result);

	}

}
