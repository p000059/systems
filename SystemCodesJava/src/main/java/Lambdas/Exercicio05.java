package Lambdas;
import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {

		ClassExer05 classExer05 = new ClassExer05();

		do {

			try {
				
				classExer05.insertNumber();

			}
			catch(NumberFormatException e) {
				
				JOptionPane.showMessageDialog(null, "Numero inválido, tente novamente!");
				classExer05.insertNumber();
				//classExer05.setNumber(Integer.parseInt(JOptionPane.showInputDialog("Entre com um número novamente: ")));
			}

		}while(classExer05.getNumber() > 0);
		
	}

}
