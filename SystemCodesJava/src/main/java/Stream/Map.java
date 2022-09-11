package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public List<Integer> changeValueItem(List<Integer> sourceList) {

		List<Integer> outPutList = sourceList.stream()
				.map(e -> e * 2) // Change each item in the list with a lambda operation.
				.collect(Collectors.toList()); // Returns results to a list.

		return outPutList;
	}

	public List<Integer> filterChangeValueItem(List<Integer> sourceList) {

		List<Integer> outPutList = sourceList.stream()
				.filter(e -> e % 2 == 0) // Filter for even numbers.
				.map(e -> e * 2)
				.collect(Collectors.toList());

		return outPutList;
	}

	public List<Integer> takeRepeatFilterChangeValueItem(List<Integer> sourceList) {

		List<Integer> outPutList = sourceList.stream()
				.distinct() // Remove repetition of values.
				.filter(e -> e % 2 == 0)
				.map(e -> e * 2)
				.collect(Collectors.toList());

		return outPutList;
	}

	public String JoinIntegersIntoString(List<Integer> sourceList) {

		/*
		 * (joining(";")) Returns a collector that concatenates the input elements,
		 * separated by the specified delimiter, in encounter order. (valueOf(e))
		 * Changes from Integer to String. The join method is for String only.
		 */

		String outPutString = sourceList.stream()
				.distinct()
				.map(e -> String.valueOf(e))
				.collect(Collectors.joining(";"));

		return outPutString;
	}

	public List<Integer> changeValueElement(List<Integer> sourceList, Integer element) {

		List<Integer> outPutList = new ArrayList<>();

		try {

			outPutList = sourceList.stream()
					.map(e -> e * element) // Change values of each element.
					.collect(Collectors.toList()); // Collects values and returns them to the list.

		} catch (Exception e) {

			outPutList = sourceList;
		}

		return outPutList;
	}

	public String convertIntToString(List<Integer> sourceList) {
		// o método joining da classe Collectors só serve para ser utilizado com
		// Strings.
		// O map vai transformar os valores a lista de inteiros "A" em string.
		// A classe Collectors vai unir os valores encontrados em "A" na string "str".

		String outPutString = "";

		try {

			outPutString = sourceList.stream()
					.map(e -> String.valueOf(e))
					.collect(Collectors.joining());

		} catch (Exception e) {

			return e.getMessage();
		}

		return outPutString;
	}

}
