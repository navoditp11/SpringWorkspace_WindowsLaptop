import java.util.Scanner;

public class PrintTrianglePyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the row size of the Triangle pyramid: ");
		int n = sc.nextInt();
		
		if(n <= 0) {
			System.out.println("Invalid Input!");
		}
		else {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n-i; j++) {
					System.out.print(" ");
				}
				for(int k = 1; k <= i; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}
