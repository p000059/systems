package IfElse;
import javax.swing.*;

/* Para criar algoritimos:
 * 1 - Entenda onde você está;
 * 2 - Dar o prôximo passo aonde você prentende ou direção a ir;
 * 3 - Avaliar o que acontece;
 * 4 - Repetir o processo.
 * */

public class TernaryConditional
{
	public static void main(String[] args)
	{
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
		
		String result = (number % 2 == 0) ? "Even Number!" : "Odd Number!";
		
		JOptionPane.showMessageDialog(null, result);
	}
}
