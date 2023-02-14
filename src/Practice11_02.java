
public class Practice11_02 {

	public static void main(String[] args) {
		// create 3 booleans 1. idPresent 2. ageLimit 3. balancePaid
		// if ageLimit is true, id is true, balancePaid is true, print sell
		// if ageLimit is true, id is true, balancePaid is not true, print not enough balance on card
		// if ageLimit is true, id is not true, print no id needed
		boolean idPresent = true;
		boolean ageLimit = true;
		boolean balancePaid = false;
		
		if (ageLimit) {
	        // within age limit
	        if (idPresent) {
	            // we have an ID
	            if (balancePaid) {
	                // all conditions are true
	                System.out.println("Sell");
	            } else {
	                // balance not paid
	                System.out.println("Not enough balance on card");
	            }
	        } else {
	            // No Id
	            System.out.println("ID Needed!");
	        }
	    } else {
	        // age limit not met
	        System.out.println("Age Limit is not met!");
	    }
		
		

	}

}
