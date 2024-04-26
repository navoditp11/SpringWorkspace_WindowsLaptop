public class printFirstNnaturalNumbersUsingRecursion {
	
	static void printFirstNnaturalNumbers(int n) {
		if(n == 0) {
			return;
		}
		printFirstNnaturalNumbers(n - 1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		printFirstNnaturalNumbers(15);

	}

}
