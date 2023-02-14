
public class forLoop {

	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			if (i % 2 ==0) {
//				System.out.print(i + "is EVEN ");
//			} else {
//				System.out.println(i + "is ODD");
//			}
//			
		
//		String fn = "Jack Ma";
//		System.out.println(fn.length());
//		System.out.println(fn.charAt(2));
//		
//		for (int i = 0; i < 10 && i > 5; i++) {
//			System.out.print(i +  ", ");
//		}
//		System.out.println();
//		System.out.println("end of the class");
		
		
//		String fn = "Jack Ma is one of the best business man in this planet!";
//		System.out.println(fn.length());
//		int countOfe = 0;
//		System.out.println(fn);
//		for (int index = 0; index < fn.length(); index++) {
//			if (fn.charAt(index) == 'e') {
//				System.out.print(fn.charAt(index));
//				countOfe++;
//			} else {
//				System.out.print('*');
//			}
//		}
//		
//		System.out.println();
		//create a string "this is a test"
		//loop to the size of the string and on every print one char
		//and then go to the next line
				
		//optional - do the same thing in reverse
//		String n = "This is a test";
//		for (int i = 0; i < n.length(); i++) {
//			System.out.print(n.charAt(i));
//			
//		}
//		
//		System.out.println();
//		
//		for (int i = n.length() -1; i >= 0; i--) {
//			System.out.print(n.charAt(i));
//		}
//		
//		for (int i = 1; i>= 10; i++) {
//			System.out.println(i + ", ");
//		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(i + " ");
			for(int j = 0; j > 6; j++) {
				System.out.print(j + " " );
			}
		}
	}

}
