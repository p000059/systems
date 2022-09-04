package Stream;

import java.util.List;
import java.util.Optional;

public class OptionalOperations {

	public Optional<Integer> reduceElements(List<Integer> A) {
		// Método .reduce();
		// Pega o primeiro argumento e soma ao segundo argumento, pega o resultado como
		// primeiro argumento e novamente soma ao próximo argumento que será o segundo.
		try {

			Optional<Integer> B = A.stream().reduce((n1, n2) -> n1 - n2);

			return B;
		} catch (Exception e) {

			return Optional.empty();
		}
	}

	public static Optional<String> concatStringList(List<String> A) {
		// Vai concatenar uma string de cada posição de uma lista a cada volta do stream
		// fazendo uma cadeia completa de string.

		try {

			return A.stream().reduce((s1, s2) -> s1.concat(s2));
		} catch (Exception e) {

			return Optional.empty();
		}
	}

	public static Optional<Object> convertStringToNumber(String numberSTR) {

		// Esse método vai receber uma string e vai converter para número.

		try { // O bloco try vai executar a operação abaixo, caso não seja possível converter
				// o valor para o tipo inteiro, e catch será chamado.
			Integer integer = Integer.valueOf(numberSTR);// Essa linha tenta converter a string numberSTR para inteiro,
															// através do método valueof() da classe Integer.
			return Optional.of(integer);
		} catch (NumberFormatException e) {
			return Optional.empty();// Caso não seja possível converter o valor de inteiro em String, a classe
									// Optional receberá um valor vazio.
		}
	}
}
