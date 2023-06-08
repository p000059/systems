import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class TestScan {

	@Test
	public void testMain() {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
        Double d = scan.nextDouble();
        int i = scan.nextInt();
        // Write your code here.

        System.out.println("String:   " + String.format("%-10s", s) + s.substring(1,4));
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}
}
