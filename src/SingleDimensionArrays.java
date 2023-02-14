
public class SingleDimensionArrays {

	public static void main(String[] args) {

		int[][][] Arrays = new int[3][4][4];

		Arrays[0][0][0] = 90;
		Arrays[0][0][1] = 10;
		Arrays[0][0][2] = 35;
		Arrays[0][0][3] = 38;

		Arrays[0][1][0] = 17;
		Arrays[0][1][1] = 88;
		Arrays[0][1][2] = 91;
		Arrays[0][1][3] = 60;

		Arrays[0][2][0] = 65;
		Arrays[0][2][1] = 16;
		Arrays[0][2][2] = 10;
		Arrays[0][2][3] = 15;

		Arrays[0][3][0] = 3;
		Arrays[0][3][1] = 6;
		Arrays[0][3][2] = 7;

		Arrays[1][0][0] = 99;
		Arrays[1][0][1] = 3;
		Arrays[1][0][2] = 1;
		Arrays[1][0][3] = 9;

		Arrays[1][1][0] = 15;
		Arrays[1][1][1] = 81;
		Arrays[1][1][2] = 100;
		Arrays[1][1][3] = 17;

		Arrays[1][2][0] = 71;
		Arrays[1][2][1] = 96;
		Arrays[1][2][2] = 80;
		Arrays[1][2][3] = 77;

		Arrays[1][3][0] = 31;
		Arrays[1][3][1] = 14;
		Arrays[1][3][2] = 33;
		Arrays[1][3][3] = 60;

		for (int table = 0; table < Arrays.length; table++) {
			for (int row = 0; row < Arrays[table].length; row++) {
				for (int col = 0; col < Arrays[table][row].length; col++) {
					System.out.print(Arrays[table][row][col] + "\t");
				}

				System.out.println();
			}
			System.out.println("-------------------");
		}

	}

}
