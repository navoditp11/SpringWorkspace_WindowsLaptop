import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstNo = sc.nextInt();
		int secondNo = sc.nextInt();
		
		int inputOperation = sc.nextInt();
		
		switch(inputOperation) {
		case 1:
			System.out.println(firstNo + secondNo);
			break;
			
		case 2: 
			System.out.println(firstNo - secondNo);
			break;
			
		case 3: 
			System.out.println(firstNo * secondNo);
			break;
			
		case 4: 
			if(secondNo == 0) {
				System.out.println("Cannot be divided");
				break;
			}
			else {
				System.out.println(firstNo / secondNo);
				break;
			  }
		default:
			System.out.println("Invalid Selection!");
			break;
		}

	}

}
