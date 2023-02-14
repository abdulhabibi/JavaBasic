
public class NastedIfStatement extends Practice{

	
	public NastedIfStatement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		boolean needToEat = true;
		double budget = 50;
		int time = 70;
		
		if (time > 60) {
			if (budget > 20 && time <30) {
				System.out.println("Sandwitch");
			}else if (budget > 30) {
					System.out.println("Fancy");
				} else {
					System.out.println("Eggs");
				}if (budget >100) {
					System.out.println("Cookfancy");
					
					} else {
						System.out.println("cook first");
					}if (budget > 10 && time > 50) {
						System.out.println("Ice Cream");
					} else {
						System.out.println("Work");
					}
				
			} 
				
			
		boolean housePurchase = true;
		int roomNum = 5;

		if (housePurchase ) {
			if (roomNum > 3)
				System.out.println("A");
			else if (roomNum ==5 && housePurchase == true)
				System.out.println("B");
			else
				System.out.println("c");
		} else {
			if (roomNum < 4)
				System.out.println("D");
			else if (housePurchase ==false)
				System.out.println("nothing");
		}
		 
		int time1 = 20;
		String result = 
		(
		time < 18
		)
		 
		?
		 "Good day." 
		:
		 "Good evening.";
		System.out.println(result); 
		
		
	}
}
