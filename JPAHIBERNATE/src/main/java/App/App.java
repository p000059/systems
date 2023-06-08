package App;

import java.util.Scanner;

import javax.persistence.EntityManager;

import Util.JPAUtil;

public class App {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
        double d = scan.nextDouble();
        int i = scan.nextInt();
        // Write your code here.

        System.out.println(s + " to HarckerRank's Java tutorials!");
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}
}
