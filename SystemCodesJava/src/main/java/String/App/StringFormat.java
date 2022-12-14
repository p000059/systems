package String.App;

import java.time.LocalDate;

public class StringFormat {

	static LocalDate ldt = LocalDate.now();
	static String s = String.format("Date: %1$tm/%1$te/%1$tY", ldt);
	
	public static void main(String[] args) {
		
		String s1 = "fsdfsdf";
		String ft = String.format("%10s", s1);

		System.out.format(ft);
		System.out.println();
		System.out.format(s);
	}
}
