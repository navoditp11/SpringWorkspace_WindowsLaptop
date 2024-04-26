import java.util.Scanner;

public class Revision1 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		/*
		 * System.out.println("Enter 1st Num: "); int num1 = sc.nextInt();
		 * System.out.println("Enter 2nd Num: "); int num2 = sc.nextInt();
		 * 
		 * System.out.
		 * println("Select operation \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Reminder"
		 * ); int operation = sc.nextInt(); int result; switch (operation) { case 1: {
		 * result = num1 + num2; System.out.println(result); break; } case 2: { result =
		 * num1 - num2; System.out.println(result); break; } case 3: { result = num1 *
		 * num2; System.out.println(result); break; } case 4: { result = num1 / num2;
		 * System.out.println(result); break; } case 5: { result = num1 % num2;
		 * System.out.println(result); break; } default: throw new
		 * IllegalArgumentException("Unexpected value: " + operation); }
		 * 
		 * 
		 * 
		 * 
		 * int i = 1; for(;;i++) { if(i % 2 != 0) continue; else if(i > 20) break; else
		 * System.out.println(i); }
		 * 
		 * 
		 * 
		 * int num = sc.nextInt(); int result = 0; int temp = num; while(num > 0) { int
		 * rem = num % 10; result = (result * 10) + rem; num = num/10; } if(result ==
		 * temp) System.out.println(temp + " is a Palindrome"); else
		 * System.out.println(temp + " is not a Palindrome");
		 * 
		 */	
		
		/*
		 * for(int i = 1; i <= 5; i++) { for(int j = 5; j >= i; j--) {
		 * System.out.print("*" + " "); } System.out.println(); }
		 */
		
		/*
		 * int num = sc.nextInt(); int i = 2; boolean flag = false; while (i <= num/2) {
		 * if(num % i == 0) { flag = true; break; } i++; } if(!flag)
		 * System.out.println("Prime"); else System.out.println("Not Prime");
		 */
		
		/*
		 * int first = 0; int second = 1; int sum = 0; int value = sc.nextInt();
		 * if(value == 0) { System.out.println(first); } else if(value == 1) {
		 * System.out.println(first + ", " + second); } else { System.out.print(first+
		 * ", " + second); while(value > 1) { sum = first + second;
		 * System.out.print(" , " + sum); first = second; second = sum; value -= 1; } }
		 */
		
		/*
		 * int num = sc.nextInt(); int fact = 1; if(num == 0) System.out.println(fact);
		 * else { while(num > 1) { fact = fact * num; num--; } }
		 * System.out.println(fact);
		 */
		
		/*
		 * int year = sc.nextInt(); if(year % 400 == 0) { System.out.println(year +
		 * " is  leap year"); } else if(year % 4 == 0 && year % 100 != 0) {
		 * System.out.println(year + " is leap year"); } else { System.out.println(year
		 * + " is not leap year"); }
		 */
		
		/*
		 * int num = sc.nextInt(); int result = 0; while(num > 0) { int rem = num % 10;
		 * result = (result * 10) + rem; num = num / 10; } System.out.println(result);
		 */
		
		
		int n = sc.nextInt();
		for(int i = 1; i<= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print("   ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*     ");
			}
			/*
			 * for(int l = n-1; l > n-i; l--) { System.out.print(" * "); }
			 */
			System.out.println();
		}
		
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String s = scan.next();
        //double d = scan.nextDouble(3.1415d);

        // Write your code here.

        System.out.println("Int: " + i);
        //System.out.println("Double: " + d);
        System.out.println("String: " + s);
	}
}
