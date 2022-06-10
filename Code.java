package Practice_Progs;

import java.util.*;

public class Cons_examples {

	Cons_examples(int x, int y, int z) {
		System.out.println("the result is: " + (x + y + z));
	}

	static void show() {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int z;
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		@SuppressWarnings("unused")
		Cons_examples obj = new Cons_examples(x, y, z);
		sc.close();

	}

	public static void main(String[] args) {
		System.out.println("enter the three numbers: ");

		Cons_examples.show();

	}

}
