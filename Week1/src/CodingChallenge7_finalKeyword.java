class Area{
	final float pi = 3.14f;
	
	void circleArea(int r) {
		float area = pi * r * r;
		System.out.println("Area of circle with radius " + r + " : " + area);
	}
}
public class CodingChallenge7_finalKeyword {

	public static void main(String[] args) {
		Area a1 = new Area();
		a1.circleArea(4);
	}

}
