import java.util.Scanner;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int temp = num;
		int result = 0;
		
		while(num > 0) {
			int rem = num % 10;
			result = (result * 10) + rem;
			num = num / 10;
		}
		
		if(result == temp)
			System.out.println(temp + " is a Palindrome Number");
		else
			System.out.println(temp + " is not a Palindrome Number");

	}
}
