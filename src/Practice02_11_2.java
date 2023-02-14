
public class Practice02_11_2 {

	public static void main(String[] args) {
		boolean needToEat = true;
		double budget = 50;
		int time = 70;
		if (needToEat) {
			// need to eat is true
			if (time > 60) {
				// time > 60
				if (budget > 20 && budget < 30) {
					System.out.println("Sandwich");
				} else {
					if (budget > 30) {
						System.out.println("Fancy");
					} else {
						System.out.println("Eggs");
					}
				}
			} else {
				// time < 60
				if (budget > 100) {
					System.out.println("cook fancy");
				} else {
					System.out.println("cook fast");
				}
			}
		} else {
			// need to eat is false
			if (budget > 10 && time > 50) {
				System.out.println("Ice Cream");
			} else {
				System.out.println("Work");
			}
		}

	}

}
