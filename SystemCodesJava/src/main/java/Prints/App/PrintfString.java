package Prints.App;

import java.util.Scanner;

public class PrintfString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = "";
		int x = 0, i = 0;

		
		

		System.out.println("================================");

		for (int j = 0; j < 2; j++) {

			System.out.print("Texto: ");
			s1 = sc.next();
			System.out.print("Numero: ");
			x = sc.nextInt();

			System.out.printf(String.format("%-15s", s1) + "%0,3d%n", x);
//			System.out.printf("%0,3d%n", x);
		}

		System.out.println("================================");
	}
}
