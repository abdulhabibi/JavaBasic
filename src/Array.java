import java.util.Iterator;

public class Array {

	public static void main(String[] args) {

////		int[] numbers = { 10, 50, 40, 22, 55, 88 };
////		System.out.println(numbers.length);
////		for (int i = 0; i < numbers.length; i++) {
////			System.out.println(numbers[i]);
////		}
//
////		for (int num : numbers) {
////			System.out.print(num + " ");
//			
////			int [] arrayOfNums = new int [5];
////			arrayOfNums [0]=15;
////			arrayOfNums [1]=6;
////			arrayOfNums [2]=43;
////			arrayOfNums [3]=62;
////			arrayOfNums [4]=21;
////			System.out.println(+ arrayOfNums.length);
////			System.out.println(arrayOfNums [0]);
////			System.out.println(arrayOfNums [2]);
////					
////			System.out.println("Welcome to TOYOTA Dealer");
////			String inventory [] = new String [6];
////			
////			inventory [0] = "Supra: 10";
////			inventory [1] = "Highlander: 100";
////			inventory [2] = "Corolla: 150";
////			inventory [3] = "Prius: 200";
////			inventory [4] = "Camery: 120";
////			inventory [5] = "Rav$: 75";	
////			for (int i = 0; i < inventory.length; i++) {
////				System.out.println(inventory[i]);
////			}
//		// create an single dimension array of sting with 5 names in it 
//		// using a for each loop, go through all and print them
//		
////		String names  [] = {"Ahmad", "Mahmood", "Nasir", "Abdul", "Gul"};
////		
////		for (String name : names) {
////			
////			System.out.println(name);
////		}
////				
//		int[] numbers = { 10, 50, 40, 22, 55, 88, 10, 50, 40, 22, 55, 88, 10, 50, 40, 22, 55, 88, 10, 50, 40, 22, 55,
//				88, 10, 50, 40, 22, 55, 88, 10, 50, 40, 22, 55, 88, 10, 50, 40, 22, 55, 88 };
//		System.out.println("size of the array: " + numbers.length);
////		for (int i = 0; i < numbers.length; i++) {
////			System.out.println(numbers[i]);
////		}
////		
//		numbers[6] = 58;
//		for (int num : numbers) {
//			System.out.print(num + " ");
//		}
//		// create an single dimension array of string with 5 names in it
//		// using a for each loop, go through all and print them
//		System.out.println();
//		String[] names = new String[5];
//		names[0] = "Jack";
//		names[1] = "Sam";
//		names[2] = "Ahmad";
//		names[3] = "Ma";
//		names[4] = "Alex";
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
//		for (String i : names) {
//			System.out.println(i);
//		}
//		// first names
//		String[] fn = new String[5];
//		// last names
//		String[] ln = new String[5];
//		// age
//		int[] age = new int[5];
//		// Jack Nicholson 70
//		fn[0] = "Jack";
//		ln[0] = "Nicholson";
//		age[0] = 70;
//		// Marlon Brando 80
//		fn[1] = "Marlon";
//		ln[1] = "Brando";
//		age[1] = 80;
//		// Denzel Washington 75
//		fn[2] = "Denzel";
//		ln[2] = "Washington";
//		age[2] = 75;
//		// Katharine Hepburn 18
//		fn[3] = "Katharine";
//		ln[3] = "Hepburn";
//		age[3] = 18;
//		// Meryl Streep 18
//		fn[4] = "Meryl";
//		ln[4] = "Streep";
//		age[4] = 18;
//		for (int i = 0; i < fn.length; i++) {
//			System.out.println("First_Name: " + fn[i] + "\tLast_Name: " + ln[i] + "\tAge: " + age[i]);
//		}
//		
//		int [][][] numsArrays3 = new int [3][3][5];
//		
//		numsArrays3 [1][0][0] = 91;
//		numsArrays3 [1][0][1] = 92;
//		numsArrays3 [1][0][2] = 93;
//		numsArrays3 [1][0][3] = 94;
//		numsArrays3 [1][0][4] = 95;
//		
//		numsArrays3 [1][1][0] = 96;
//		numsArrays3 [1][1][1] = 97;
//		numsArrays3 [1][1][2] = 98;
//		numsArrays3 [1][1][3] = 99;
//		numsArrays3 [1][1][4] = 90;
//		
//		numsArrays3 [1][2][0] = 89;
//		numsArrays3 [1][2][1] = 88;
//		numsArrays3 [1][2][2] = 87;
//		numsArrays3 [1][2][3] = 86;
//		numsArrays3 [1][2][4] = 85;
//		
//	
//		
//		for(int table = 0; table < numsArrays3.length; table++) {
//			for (int row =0; row<numsArrays3[table].length; row++) {
//				for (int col =0; col<numsArrays3[table][row].length; col++) {
//					System.out.print(numsArrays3[table][row][col] + "\t");
//				}
//				System.out.println();
//			}
//			System.out.println("---------------------------------");
//		}

		int[][][] numsArrays3 = new int[3][3][5];

		numsArrays3[1][0][0] = 91;
		numsArrays3[1][0][1] = 92;
		numsArrays3[1][0][2] = 93;
		numsArrays3[1][0][3] = 94;
		numsArrays3[1][0][4] = 95;

		numsArrays3[1][1][0] = 96;
		numsArrays3[1][1][1] = 97;
		numsArrays3[1][1][2] = 98;
		numsArrays3[1][1][3] = 99;
		numsArrays3[1][1][4] = 90;

		numsArrays3[1][2][0] = 89;
		numsArrays3[1][2][1] = 88;
		numsArrays3[1][2][2] = 87;
		numsArrays3[1][2][3] = 86;
		numsArrays3[1][2][4] = 85;

		for (int table = 0; table < numsArrays3.length; table++) {
			for (int row = 0; row < numsArrays3[table].length; row++) {
				for (int col = 0; col < numsArrays3[row][table].length; col++) {
					System.out.print(numsArrays3[table][row][col] + "\t");
				}

				System.out.println();
			}
			System.out.println("-------------------");

		}
		
		for (int row = 0; row < 5; row++) {
			for(int col = 0; col <= row; col++) {
				System.out.print(row + col +" ");
			}
			System.out.println();
			
			
		}

	}

}
