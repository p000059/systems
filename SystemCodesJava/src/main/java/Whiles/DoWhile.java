package Whiles;
import javax.swing.JOptionPane;

//O código abaixo demonstra o uso do do/while

public class DoWhile {

	public static void main(String[] args) {

		int count = 0;

		do {
			
			JOptionPane.showMessageDialog(null, "Count -> " + count);
			System.out.println("Contador = " + count);
			count = count + 1;
			
		} while (count <= 10);
	}
}
