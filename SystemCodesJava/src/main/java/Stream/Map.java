package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public List<Integer> changeValueItem(List<Integer> sourceList) {

		List<Integer> returnList = sourceList.stream()
				.map(e -> e * 2) // Change each item in the list with a lambda operation.
				.collect(Collectors.toList()); // Returns results to a list.

		return returnList;
	}

	public List<Integer> filterChangeValueItem(List<Integer> A) {

		List<Integer> B = A.stream()
				.filter(e -> e % 2 == 0) // Filter for even numbers.
				.map(e -> e * 2)
				.collect(Collectors.toList());

		return B;
	}

	public List<Integer> takeRepeatFilterChangeValueItem(List<Integer> A) {

		List<Integer> B = A.stream()
				.distinct() // Remove repetition of values.
				.filter(e -> e % 2 == 0)
				.map(e -> e * 2)
				.collect(Collectors.toList());

		return B;
	}

//	public void fifteenthExample(List<Integer> A) {
//		Map<Boolean, List<Integer>> mmap = A.stream().distinct() // Não permite a repetição de números.
//				.collect(Collectors.groupingBy(e -> e % 2 == 0));// Agrupa(coleta) o resultado da expressão que é
//																	// verdadeira em par e falso em impar.
//		System.out.println("New list " + mmap + " ");
//	}
//
//	public void sixteenthExample(List<Integer> A) {
//		Map<Integer, List<Integer>> mmap = A.stream().distinct() // Não permite a repetição de números.
//				.collect(Collectors.groupingBy(e -> e % 3));
//		System.out.println(mmap);
//	}
//
//	public void seventeenthExample(List<Integer> A) {
//		String str = A.stream()
//				// .distinct() //Não permite a repetição de valores.
//				.map(e -> String.valueOf(e)) // O map vai transformar os valores a lista de inteiros "A" em string.
//				.collect(Collectors.joining(";")); // A classe Collectors vai unir os valores encontrados em "A" na
//													// string "str".
//		// o método joining da classe Collectors só serve para ser utilizado com
//		// Strings.
//		System.out.println(str);
//	}
//
//	public void GroupEvenAndOdd(List<Integer> A) {
//
//		Map<Boolean, List<Integer>> mmap = A.stream()
//				.collect(Collectors.groupingBy(e -> e % 2 == 0));
//
//		
//	}

	public List<Integer> changeValueElement(List<Integer> A, Integer element) {

		List<Integer> B = new ArrayList<>();

		try {
			
			B = A.stream()
					.map(e -> e * element) // Change values of each element.
					.collect(Collectors.toList()); // Return to the list new values.
			
		} catch (Exception e) {
			
			A = null;
			B = A;
		}

		return B;
	}
	
	public String convertIntToString(List<Integer> A) {
		// o método joining da classe Collectors só serve para ser utilizado com
		// Strings.
		// O map vai transformar os valores a lista de inteiros "A" em string.
		// A classe Collectors vai unir os valores encontrados em "A" na string "str".

		String str = "";

		try {

			str = A.stream().map(e -> String.valueOf(e)).collect(Collectors.joining());

		} catch (Exception e) {

			return e.getMessage();
		}

		return str;
	}
}
