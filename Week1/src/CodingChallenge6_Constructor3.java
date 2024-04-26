class ThreeDimensionShape{
	double width, height, depth;
	ThreeDimensionShape(){
		height = width = depth = 0;
	}
	
	ThreeDimensionShape(double length){
		height = width = depth = length;
	}
	
	ThreeDimensionShape(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double volume() {
		return width * height * depth;
	}
}
public class CodingChallenge6_Constructor3 {

	public static void main(String[] args) {
		ThreeDimensionShape t1 = new ThreeDimensionShape();
		ThreeDimensionShape t2 = new ThreeDimensionShape(2);
		ThreeDimensionShape t3 = new ThreeDimensionShape(2,3,4);
		
		double volume;
		
		volume = t1.volume();
		System.out.println("Volume of Shape1: " + volume);
		volume = t2.volume();
		System.out.println("Volume of Shape2: " + volume);
		volume = t3.volume();
		System.out.println("Volume of Shape3: " + volume);

	}

}
