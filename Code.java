package Practice_Progs;

import java.util.*;

public class Cons_examples {

	Cons_examples(int x, int y) {
		System.out.println("the result is: " + (x + y));
	}

	static void show() {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		x = sc.nextInt();
		y = sc.nextInt();
		@SuppressWarnings("unused")
		Cons_examples obj = new Cons_examples(x, y);
		sc.close();

	}

	public static void main(String[] args) {
		System.out.println("enter the two numbers: ");

		Cons_examples.show();

	}

}
