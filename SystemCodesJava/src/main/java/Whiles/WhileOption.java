package Whiles;
import javax.swing.JOptionPane;

public class WhileOption {

	public static void main(String[] args) {

		int number = 0;

		while (!(number == 3)) {

			number = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Digite um número: \nOu '3' para sair: "));

			if(number !=3) {
				
				JOptionPane.showMessageDialog(null, "O número digitado foi: " + number);
			} else {
				
				break;
			}

		}
	}

}
