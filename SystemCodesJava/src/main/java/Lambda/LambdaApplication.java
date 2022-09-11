package Lambda;

import javax.swing.JOptionPane;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LambdaApplication {

	public static void main(String[] args) {

		// region UnaryOperator
		// Essa interface herda da superinterface Function, que possui o método
		// apply(Object) que recebe um parâmetro genérico e retorna o resultado.
		// UnaryOperator<Double> doubleUnaryOperator = n -> 98.5 - n; // Essa expressão
		// também pode ser usada, pois recebe somente um parametro e uma expressão
		// simples.

		UnaryOperator<Double> doubleUnaryOperator = (n) -> {
			return 98.5 - n;
		};
		JOptionPane.showMessageDialog(null, "Valor Unary: " + doubleUnaryOperator.apply(1.5));

		// endregion

		// region Predicate
		// Esse predicate vai passar um argumento do tipo inteiro que vai ser avaliado
		// se é impar ou par pela expressão lambda.
		Predicate<Integer> even = value -> value % 2 == 0;
		JOptionPane.showMessageDialog(null, "Valor do número: " + even.test(10));// O método teste vai receber o
																					// parãmetro inteiro.
		// endregion

		// region Variable
		// Inteface funcional que utiliza somente o método sem parameter.
		IFunctionalMethodNoParameter iFunctionalMethodNoParameter = () -> 98.5;
		JOptionPane.showMessageDialog(null, iFunctionalMethodNoParameter.getValue());
		// endregion

		// region IfunctionOneParameter
		// Nesse exemplo a seguir a inteface funcional utiliza um argumento da interface
		// na expessão lambda.
		IFunctionalMethodOneParameter iFunctionalMethodOneParameter = (n) -> 1.0 / n;
		JOptionPane.showMessageDialog(null, "Result = " + iFunctionalMethodOneParameter.getValue(4));
		// endregion

		// region functionTwoParameter
		IFunctionalMethodTwoParameter iFunctionalMethodTwoParameter;

		iFunctionalMethodTwoParameter = (double n, double y) -> (n < y); // Essa referencia quanto ao tipo dos
																			// parametros, pode ser especificada ou não.
		if (iFunctionalMethodTwoParameter.getValue(2.0, 10.0)) {
			JOptionPane.showMessageDialog(null, "2 is less then 10");
		} else if (iFunctionalMethodTwoParameter.getValue(10.0, 2.0)) {
			JOptionPane.showMessageDialog(null, "10 is great then 2");
		}

		iFunctionalMethodTwoParameter = (n, y) -> (n % y) == 0; // Nessa declaração de parametros, o tipo é compreendido
																// por inferência.
		if (iFunctionalMethodTwoParameter.getValue(2.0, 10.0)) {
			JOptionPane.showMessageDialog(null, "A number is pair!");
		} else if (iFunctionalMethodTwoParameter.getValue(10.0, 5.0)) {
			JOptionPane.showMessageDialog(null, "A number is Odd!");
		}
		// endregion

		// Interface com método genérico.
		IGenericInterface<Integer> iGenericInterface = (x, y, z) -> (x % y == z);

		if (iGenericInterface.test(4, 2, 0)) {

			JOptionPane.showMessageDialog(null, "The number is pair.");
		} else if (iGenericInterface.test(5, 2, 1)) {

			JOptionPane.showMessageDialog(null, "The number is Odd.");
		} else {

			JOptionPane.showMessageDialog(null, "Invalid Number");
		}
	}
}
