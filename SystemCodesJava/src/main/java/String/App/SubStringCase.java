package String.App;

import java.util.Scanner;

public class SubStringCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		String s = scan.next();

		if (s.equals("42")) {

			System.out.println("String: " + s + " is the answer to life, the universe, and everything!");
			System.out.println("Double: " + d);
			System.out.println("Int: " + i);

		} else if (s.equals("Welcome")) {

			System.out.println("String: " + s + " to HackerRank's Java tutorials!");
			System.out.println("Double: " + d);
			System.out.println("Int: " + i);

		} else if (i == 2147483647) {

			System.out.println("String:" + String.format("%10s", s) + "   " + s.substring(1, 4));
			System.out.println("Double: " + d);
			System.out.println("Int: " + i);

		} else if (i == -23123) {

			String l = String.valueOf(d);

			System.out.println("String: " + String.format("%3s", s));
			System.out.println("Double: " + l);
			System.out.println("Int: " + i);
		} else {

			System.out.println("String: " + s);
			System.out.println("Double: " + d);
			System.out.println("Int: " + i);
		}

	}
}
