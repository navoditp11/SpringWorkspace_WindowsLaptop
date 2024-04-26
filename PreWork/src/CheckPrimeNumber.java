import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int i = 2;
		boolean flag = false;
		
		while(i < num) {
			if(num % i == 0) {
				flag = true;
				break;
			}			
		i++;
		}
		
		if(!flag)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");

	}

}
