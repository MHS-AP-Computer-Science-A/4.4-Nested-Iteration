
public class Main {

	public static void main(String[] args) {

		//Display all dice value pairs
		for (int d1 = 1; d1 <= 6; d1++) {
			for (int d2 = 1; d2 <= 6; d2++) {
				System.out.println(d1 + ", " + d2);
			}
		}
		
		//Display a rectangle
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 5; col++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
}
