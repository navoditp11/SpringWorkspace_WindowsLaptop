import java.util.Scanner;

public class Pandemic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Records: ");
		int n = sc.nextInt();
		
		int vaccineStrength[] = new int[n];
		int patientImmunityStrength[] = new int[n];
		
		System.out.println("Enter " + n + " records of Vaccine's immunity strength: ");
		for(int i = 0; i < n; i++) {
			vaccineStrength[i] = sc.nextInt();
		}
		
		System.out.println("Enter " + n + " records of Patient's immunity strength: ");
		for(int i = 0; i < n; i++) {
			patientImmunityStrength[i] = sc.nextInt();
		}
		
		bubbleSort(vaccineStrength);
		bubbleSort(patientImmunityStrength);
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(vaccineStrength[i] < patientImmunityStrength[i])
				count++;
		}
		
		if(count > 0)
			System.out.println("No");
		else
			System.out.println("Yes");

	}

	private static void bubbleSort(int[] array) {
		int i, j, temp = 0;
		for(i = 0; i < array.length; i++) {
			for(j = i + 1; j < array.length; j++) {
				if(array[j] > array[i]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
	}

}
