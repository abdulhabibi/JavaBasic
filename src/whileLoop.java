
public class whileLoop {

	public static void main(String[] args) {
		int i = 8;
		int x = 0;
		while (i < 10) {
			System.out.println(x++);

			i++;
		}
		System.out.println("x is" + x);
		int num1 = 7;
		while (num1 > 3) {
			System.out.print(--num1 + " ");
			System.err.print(--num1 + " ");
		}

		char b = 'A';
		while (b <= 'Z') {
			System.out.print(b++ + " ");
		}

		int num = 0;
		int maxNum = 10;

		while (num != 10) {
			System.out.print(++num + " ");

		}

		int number = 15;
		boolean condition = true;
		while (condition) {

		}
		if (number < 10)
			;
		{
			System.out.println("The number is less then 10");
			condition = false;
		}
		if (number < 15) {
			System.out.println("The number is less then 15");
			condition = false;
		} else {
			System.out.println("The number is less or equal to 20");
			condition = false;
		}

		int x1 = 2;
		do {
			System.out.println("hello");
			x1--;
		} while (x1 > 0);

		int k = 6;
		do {
			System.out.println("k" + k);
			k++;
		} while (k <= 12);

		int studentAge = 19;
		int looping = 3;
		if (studentAge >= 7 && studentAge <= 17) {
			System.out.println("this student is ready for school");
			do {
				System.out.println(studentAge);
				System.out.println("looping");
				looping--;
			} while (looping >= 0);
		} else if (studentAge >= 18) {
			System.out.println("This student is ready for college");
		} else {
			System.out.println("This student is not ready for school");
		}
	}

}
