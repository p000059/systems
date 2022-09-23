package IfElse;
import javax.swing.*;

public class IfElseSalaryIncrease 
{
	public static void main(String[] args){
		
		double salaryFinal = 0.0;
		
		double salary = Float.parseFloat(JOptionPane.showInputDialog("Enter the Salary: "));
		double increase = 0.0; //Float.parseFloat(JOptionPane.showInputDialog("Increase: "));
		
		if(salary <= 1000.0) {
			
			increase = 0.20;
			salaryFinal = salary + (salary * increase);			
		
		} else if (salary > 1000.0 && salary < 2000.0){
			
			increase = 0.10;
			salaryFinal = salary + (salary * increase);
			
		} else if(salary >= 2000.0 && salary < 3000.0){
			
			increase = 0.08;
			salaryFinal = salary + (salary * increase);
			
		} else if(salary >=3000.0 && salary < 4000.0){
			
			increase = 0.05;
			salaryFinal = salary + (salary * increase);
			
		} else if (salary >= 4000.0){
			
			increase = 0.04;
			salaryFinal = salary + (salary * increase);						
		} else {
			
			increase = 0.30;
			salaryFinal = salary + (salary * increase);
		}
		
		
		JOptionPane.showMessageDialog(null, "Salary = " + salaryFinal);
	}
}
