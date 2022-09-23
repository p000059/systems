package IfElse;
import javax.swing.*;

public class IfElseAssessAge 
{
	public static void main(String[]args)
	{
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter with age: "));
		
		if(age >= 18) 
		{
			JOptionPane.showMessageDialog(null, "Adult, Major");
		}
		else if(age <= 12){
			
			JOptionPane.showMessageDialog(null, "Child");
			
		}
		else if(age >= 13 && age <=17)
		{
			JOptionPane.showMessageDialog(null, "Teen");
		}
		else if(age > 65) {
			JOptionPane.showMessageDialog(null, "Elderly");
		}
		else {
			JOptionPane.showMessageDialog(null, "Age Invalid!");
		}
	}
}
