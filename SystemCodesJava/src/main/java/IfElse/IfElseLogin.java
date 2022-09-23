package IfElse;
import javax.swing.*;

public class IfElseLogin
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("Enter with user: ");
		
		if(name.equalsIgnoreCase("Admin") || name.equalsIgnoreCase("Administrator"))
		{
			JOptionPane.showMessageDialog(null, "Sucess");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "User Invalid!");
		}
	}
}
