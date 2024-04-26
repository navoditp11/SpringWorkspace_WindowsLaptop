class ConstructorDemo1{
	int age = 22; 
	float salary = 20000.0f; 
	String name = "Sneha"; 
	char sex = 'F';
	ConstructorDemo1(){
		System.out.println("I am default constructor.");
	}
	
	ConstructorDemo1(int age, float salary, String name, char sex){
		this.age = age;
		this.salary = salary;
		this.name = name;
		this.sex = sex;
		
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		System.out.println("Name: " + name);
		System.out.println("Sex: " + sex);
		
	}
	
}
public class CodingChallenge5_Constructors2 {

	public static void main(String[] args) {
		ConstructorDemo1 c1 = new ConstructorDemo1();
		
		ConstructorDemo1 c2 = new ConstructorDemo1(26, 50000.0f, "Navodit Pan", 'M');

	}

}
