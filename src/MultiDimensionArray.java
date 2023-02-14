
public class MultiDimensionArray {

	public static void main(String[] args) {

//		int[][] nums = new int[3][3];
//		nums[0][0] = 1;
//		nums[0][1] = 2;
//		nums[0][2] = 3;
//
//		nums[1][0] = 4;
//		nums[1][1] = 5;
//		nums[1][2] = 6;
//
//		nums[2][0] = 7;
//		nums[2][1] = 8;
//		nums[2][2] = 9;
//
//		// int [][] nums2 = { {1,2,3}, {4,5,6}, {7,8,9}};
//
//		for (int row = 0; row < nums.length; row++) {
//			for (int col = 0; col < nums[row].length; col++) {
//				System.out.print(nums[row][col] + " ");
//			}
//			System.out.println();
//
//			String[] dayOfWeek = new String[7];
//			dayOfWeek[0] = "Sunday";
//			dayOfWeek[1] = "Monday";
//			dayOfWeek[2] = "Tuesday";
//			dayOfWeek[3] = "Wednesday";
//			dayOfWeek[4] = "Thursday";
//			dayOfWeek[5] = "Friday";
//			dayOfWeek[6] = "Saturday";
//
//			for (int i = 0; i < dayOfWeek.length; i++) {
//
//				System.out.println(dayOfWeek[i]);
//			}
//
//		}
		
//		int [][] array2D = new int [2][3];
//		array2D [0][0]=2;
//		array2D [0][1]=3;
//		array2D [0][2]=4;
//		
//		array2D [1][0]=7;
//		array2D [1][1]=8;
//		array2D [0][2]=9;
//		
//		for (int[] array1D : array2D) {
//			for (int num : array1D) {
//				System.out.print(num + " ");
//			}
//			System.out.println();
//		}
		int [][][] data = new int [3][4][5];
		
		data [0][0][0]=1;
		data [0][0][3]=5;
		data [0][1][1]=2;
		data [0][1][4]=6;
		data [0][2][2]=3;
		data [0][3][3]=4;
		
		data [1][0][0]=7;
		data [1][0][3]=11;
		data [1][1][1]=8;
		data [1][1][4]=12;
		data [1][3][3]=10;
		
		data [2][0][0]=13;
		data [2][0][3]=17;
		data [2][1][1]=14;
		data [2][1][4]=18;
		data [2][2][2]=15;
		data [2][3][3]=16;
		
		for (int table=0; table < data.length; table ++) {
			for (int row = 0; row < data[table].length; row++) {
				for (int col = 0; col < data[table][row].length; col++) {
					System.out.print(data[table] [row] [col] + "\t ");
				}
				System.out.println();
				
			}System.out.println("************************");
		}
				
	}

}
