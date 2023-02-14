
public class PatternsAreFun {

	public static void main(String[] args) {
		
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		System.out.println("  ");
		for (int row = 1; row <= 5; row++) {
			for (int col = row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		System.out.println(" ");
		int area = 5;
		for (int row = 0; row < area; row++) {
			for (int col = 0; col < area; col++) {
				if (row == 0 || row == (area - 1)) {
					System.out.print(col+1 +" ");
				} else {
					if (col == 0 || col == (area - 1)) {
						System.out.print(col+1 +" ");
					} else {
						System.out.print("  ");
					}
				}
				
			}
			System.out.println(" ");
		}
		
		

		
	}
}
