package IfElse;
import javax.swing.*;

public class IfElseEvenOddNumber
{
	public static void main(String[] args)
	{
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
		
		if(number % 2 == 0){
			
			JOptionPane.showMessageDialog(null, "Even Number! ");
			
		} else if(number % 2 == 1){
			
			JOptionPane.showMessageDialog(null, "Odd Number! ");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Invalid Number!");
		}
	}
}
