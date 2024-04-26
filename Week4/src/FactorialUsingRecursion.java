public class FactorialUsingRecursion {
	public int calculateFactorial(int n) {
		/*if(n<0) {
			return -1;
		}*/
		if(n==0 || n==1) {
			return 1;
		}
		return n * calculateFactorial(n-1);
	}

	public static void main(String[] args) {
		FactorialUsingRecursion f1 = new FactorialUsingRecursion();
		int factorial = f1.calculateFactorial(5);
		System.out.println(factorial);
	}

}
