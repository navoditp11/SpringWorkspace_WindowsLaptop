class ConstructorDemo{
	
	ConstructorDemo(){
		this("Navo");
		System.out.println("This is a default constructor");
	}
	
	ConstructorDemo(String s){
		System.out.println("This is a Parameterized constructor with a String input - " + s);
	}
}
public class CodingChallenge4_Constructor {

	public static void main(String[] args) {
		ConstructorDemo c1 = new ConstructorDemo();
		//ConstructorDemo c2 = new ConstructorDemo("Navo");
	}

}
