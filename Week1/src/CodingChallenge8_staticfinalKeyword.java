class StaticFinal{
	int var1 = 10;
	static int var2 = 10;
	
	void method1() {
		var1++;
		System.out.println(var1);
	}
	
	void method2() {
		var2++;
		System.out.println(var2);
	}
}
public class CodingChallenge8_staticfinalKeyword {

	public static void main(String[] args) {
		StaticFinal obj1 = new StaticFinal();
		StaticFinal obj2 = new StaticFinal();
		StaticFinal obj3 = new StaticFinal();
		
		obj1.method1(); //11
		obj2.method1(); //11
		obj3.method1(); //11
		
		obj1.method2(); //11
		obj2.method2(); //12
		obj3.method2(); //13

	}

}
