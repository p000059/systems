package For.AppFor;

import java.util.Scanner;

public class ForExpression {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			int total = 0;

			for (int j = 0; j < n; j++) {

				a += (int) Math.pow(2, j) * b;
				System.out.print(a + " ");
			}
			// a = 0;
			System.out.println("");
		}

		sc.close();
	}
}
