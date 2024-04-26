class Customer{
	String fullName;
	int age;
}
public class CodingChallenge1_ClassesObjects {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.fullName = "Navodit Pan";
		c1.age = 26;
		
		System.out.println("Name: " + c1.fullName);
		System.out.println("Age: " + c1.age);

	}

}
