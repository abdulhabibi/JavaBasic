import java.util.Iterator;

public class TringleForLoop {

	public static void main(String[] args) {
		int area = 5;

		for (int star = 1, space = area; star <= area; star++, space--) {
			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= star; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

//		String a = "this is a test";
//		for (int i = 0; i < a.length(); i++) {
//			System.out.print(a.charAt(i) + " ");
//		}
//		System.out.println();
//		for (int i = a.length() - 1; i >= 0; i--) {
//			System.out.print(a.charAt(i) + " ");
//
//		}
//		
//		String fn = "Big boss";
//		for (int i = 0; i < fn.length(); i++) {
//			System.out.println(fn.charAt(i) +" ");
//		}
//		for (int i = fn.length() -1; i >=  0; i--) {
//			System.out.println(fn.charAt(i) +" ");
//		}
		System.out.println("-----------------");
		
//		
		String ln = "I am hungry";
		for (int i = 0; i < ln.length(); i++) {
			System.out.print(ln.charAt(i));
		} System.out.println();
		System.out.println("-----------------");
		
		for (int i = ln.length() -1; i >=0; i--) {
			System.out.print(ln.charAt(i));
			
			
		}System.out.println();
		
		System.out.println("-----------------");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("This is exercise");
		}
	}

}
