package String.App;

public class SubString {

	public static void main(String[] args) {

		String s = "fsdfsdf";
		String ft = String.format("%10s", s);

		System.out.format(ft);
		System.out.println();
		System.out.format( "String:" + String.format("%10s", s) + "   " + s.substring(1, 4));

	}
}
