import java.util.Scanner;

public class Revision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter 1st Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Select any operation \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
		int operation = sc.nextInt();
		
		switch(operation) {
		case 1:
			System.out.println(num1 + " + " + num2 + " = " + num1+num2);
			break;
		case 2:
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case 3:
			System.out.println(num1 + " * " + num2 + " = " + num1*num2);
			break;
		case 4:
			if(num2 == 0) {
				System.out.println("Cannot be divided");
			}
			else
				System.out.println(num1 + " / " + num2 + " = " + num1/num2);
			break;
		default:
			System.out.println("Invalid selection");
		}*/
		
		/*int j = 1;
		for(j = 1; j <= 10; j++) {
			if(j == 4) {
				continue;
			}
			System.out.println(j);
		}
		
		int i = 1;
		while(i<=10) {
			if(i==3) {
				i++;
				continue;
			}
			System.out.println(i);
		    i++;
		}
		
		int i = 1;
		for(; ; i++) {
			if(i%2 != 0)
				continue;
			else if(i>20)
				break;
			else
				System.out.println(i);
		}*/
		
		/*int num = 1232;
		int temp = num;
		int result = 0;
		while(num > 0) {
			int rem = num % 10;
			result = (result * 10) + rem;
			num = num/10;
		}
		if(result == temp)
			System.out.println(temp + " is a Palindrome");
		else
			System.out.println(temp + " is not a Palindrome");*/
		
		/*for(int i = 1; i<=5; i++) {
			for(int j = 5; j>=i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}*/
		
		/*int num = 16;
		int i = 2;
		boolean flag = false;
		while(i <= num/2) {
			if(num%i == 0) {
				flag = true;
				break;
			}
		i++;		
		}
		if(!flag)
			System.out.println("Prime num");
		else
			System.out.println("Not Prime num");*/
		
		/*int first = 0;
		int second = 1;
		int sum = 0;
		int value = sc.nextInt();
		
		if(value == 0) {
			System.out.println(first);
		}
		else if(value == 1) {
			System.out.println(first + ", " + second);
		}
		else {
			System.out.print(first + ", " + second);
			while(value > 1) {
				sum = first + second;
				System.out.print(", " + sum);
				first = second;
				second = sum;
				value-=1;
			}
		}*/
		
		/*int num = sc.nextInt();
		int fact = 1;
		if(num == 0) {
			fact = 1;
		}
		else {
			while(num > 1) {
				fact = fact * num;
				num--;
			}
		}
		System.out.println(fact);*/
		
		/*int year = 1700;
		boolean flag = false;
		if(year % 400 == 0)
			flag = true;
		else if(year % 4 == 0 && year % 100 != 0)
			flag = true;
		else
			flag = false;
		
		if(flag)
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");*/
		
		/*int num = 1234;
		int temp = num;
		int rem, rev = 0;
		if(num<0)
			System.out.println("0");
		
		while(num>0) {
			rem = num%10;
			rev = (rev*10) + rem;
			num = num/10;
		}
		System.out.println("Reverse of " + temp + " = " + rev);*/
		
		
	}
}
