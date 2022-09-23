package IfElse;
import javax.swing.*;

public class IfElseSimpleMaleFemale {
	public static void main(String[] args)
	{
		int result = Integer.parseInt(JOptionPane.showInputDialog("1 - For Male \n2 - For Female"));
		
		if(result == 1)
		{
			JOptionPane.showMessageDialog(null, "Option Male ");
		}
		else if (result == 2)
		{
			JOptionPane.showMessageDialog(null, "Option Female ");
		}
		else {
			JOptionPane.showMessageDialog(null, "Option Invalid!");
		}
				
	}
}
