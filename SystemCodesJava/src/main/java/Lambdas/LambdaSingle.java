package Lambdas;
import javax.swing.JOptionPane;

public class LambdaSingle {

	public static void main(String[] args) {
		
		INumber iNumber; //Declara uma referência de interface funcional que não possui passagem de parâmetros.
		INumberParam iNumberParam; //Declara uma referência de interface funcional que possui passagem de parâmetros.
		
		iNumber = () -> 100.5; //Expressão Lambda Simples sem passagem de parâmetro.
		iNumberParam = (n) -> 100.5 + n; //Expressão Lambda simplse com passagem de parâmetros.
		
		
		JOptionPane.showMessageDialog(null, 
				"Lambda com Parâmetros: " + iNumber.getValue()
				+ "\nLambda sem Parâmetros: " + iNumberParam.getValue(50.0));

	}

	public interface INumber {

		double getValue();
	}

	public interface INumberParam {

		double getValue(double value);
	}

}
