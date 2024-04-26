import java.util.Scanner;

public class FactorialUsingMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		long n = sc.nextInt();
		long fact = 0;
		
		fact = calFact(n);
		
		System.out.println("Factorial: " +fact);

	}
	
	static long calFact(long x) {
		long fact = 1;
		
		if (x==0) {
			return fact;
		}
		
		for(int i=1; i<=x; i++) {
			fact = fact*i;
		}
		
		return fact;
	}

}

