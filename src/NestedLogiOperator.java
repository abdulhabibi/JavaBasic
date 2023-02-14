
public class NestedLogiOperator {

	public static void main(String[] args) {
		int age = 60;
		double price = 489.85;
		boolean primeMember = true;
		// if its a prime member, we give 5% discount
		// if age is more than 20, we give another 3% discount
		// if age is more than 30, we give another 2% discount
		// if age is more than 40, we give another 1% discount
		// for non prime members, we have 2% discount
		// if age is more 60, we add another 1% discount
		if (primeMember) {
			// this is for prime members
			if (age > 40) {
				// 6%
				System.out.println(
						"You are saving 6% or $" + (price * 0.06) + ". Your total is $" + (price - (price * 0.06)));
			} else if (age > 30) {
				// 7%
			} else if (age > 20) {
				// 8%
			} else {
				// 5%
			}
		} else {
			// this is non prime members
			if (age > 60) {
				// 3%
			} else {
				// 2%
			}
		}
//		if (primeMember == true && age > 40) {
//			// 5 + 1 = 6% discount
//			System.out.println(price * 0.06);
//		} else if (primeMember == true && age > 30) {
//			// 5 + 2 = 7% discount
//			System.out.println(price * 0.07);
//		} else if (primeMember == true && age > 20) {
//			// 5 + 3 = 8% discount
//			System.out.println(price * 0.08);
//		} else if (primeMember  == false && age > 60 ) {
//			// 2 + 1 = 3% discount
//			System.out.println(price * 0.03);
//		} else if (primeMember == false && age <= 60) {
//			// 2% discount
//			System.out.println(price * 0.02);
//		}
//		char a = 'D';
//		System.out.println((int)a);
		
		
////		
//		int a = 5;
//		int b = 6;
//		int c = ++a - b++ + a++;
//		         
//		System.out.println(c);
//		System.out.println(a);
//		
//		String sentence = "\tI shouted, \"Go away!\"as I ran towards the wolf.\n\t\t it bared its teeth at me in reply.";
//		System.out.println(sentence);
//		
//		int agee = 9;
//		double height = 4.3; 
//
//		String output = "Billy is " + agee + " years old, and "
//		              + height + " feet tall.";
//
//		System.out.print(output);
		
		int grade = 59;
		if (grade < 60)
		    System.out.println("You are failing.");
		else
		    System.out.println("You are passing.");
		
		
		
		



	


}
}

