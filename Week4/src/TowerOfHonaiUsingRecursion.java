public class TowerOfHonaiUsingRecursion {
	
	static void towerOfHonaiImplementation(int no, char from_pole, char to_pole, char auxilary_pole) {
		if(no == 1) {
			System.out.println("Move disk 1 from pole " + from_pole + " to pole " + to_pole);
			return;
		}
		towerOfHonaiImplementation(no-1, from_pole, auxilary_pole, to_pole);
		System.out.println("Move disk " + no + " from pole " + from_pole + " to pole " + to_pole);
		towerOfHonaiImplementation(no-1, auxilary_pole, to_pole, from_pole);
	}

	public static void main(String[] args) {
		int no = 5;
		towerOfHonaiImplementation(no,'X','Y','Z');

	}

}
