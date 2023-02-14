import java.util.Random;
import java.util.Scanner;
public class RandomSelection {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int num = rand.nextInt(10) + 1;
		System.out.println("I'm thinking of a number between 1 and 10. Try to guess it.");
		Scanner scan = new Scanner(System.in);
		while (true) {
			int guess = scan.nextInt();
			if (guess > num) {
				System.out.println("Too high");
			} else if (guess < num) {
				System.out.println("Too low");
			} else {
				System.out.println("Correct!");
				break;
			}
		}
		System.out.println("The number was " + num);



	}

}
