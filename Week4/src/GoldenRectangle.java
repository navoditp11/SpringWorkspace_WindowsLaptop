import java.util.Scanner;

public class GoldenRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rectangles: ");
		int noOfRectangles = sc.nextInt();
		int count = 0;
		double ratio;
		
		for(int i = 0; i < noOfRectangles; i++) {
			System.out.println("Enter the width of Rectangle " + (i+1) + " : " );
			double width = sc.nextInt();
			System.out.println("Enter the height of Rectangle " + (i+1) + " : " );
			double height = sc.nextInt();
			
			if(width > height)
				ratio = width/height;
			else
				ratio = height/width;
			
			if(ratio >= 1.6 && ratio <= 1.7)
				count++;		
		}
		System.out.println("Number of Golden Rectangles: " + count);
		sc.close();
	}

}
