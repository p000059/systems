package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter<T> {

	public List<Integer> filterEvenNumber(List<Integer> sourceList) {

		List<Integer> outPutList = new ArrayList<>();
		
		try {
			
			outPutList = sourceList.stream()
					.filter(e -> e % 2 == 0) // Filter for even numbers.
					.collect(Collectors.toList()); // Returns collected results(elements) for a new list.

			return outPutList;
			
		} catch (Exception e) {

			outPutList = sourceList;
			return outPutList;
		}
	}
	
	public List<String> filterString(List<String> sourceList, String word) {

		List<String> outPutList = new ArrayList<>();
		
		try {
			
			outPutList = sourceList.stream()
					.filter(p -> p.equals(word)) // Filter if String is equal.
					.collect(Collectors.toList()); // Returns collected results(elements) for a new list.

			return outPutList;
			
		} catch (Exception e) {

			outPutList = sourceList;
			return outPutList;
		}
	}
	
	public List<T> filterPredicate(List<T> sourceList, T object) {

		List<T> outPutList = new ArrayList<>();
		
		try {

			outPutList = sourceList.stream()
					.filter(T -> T.equals(object)) // Returns results equal to the object passed by parameter.
					.collect(Collectors.toList()); // Returns collected results(elements) for a new list.

			return outPutList;
			
		} catch (Exception e) {

			outPutList = sourceList;
			return outPutList;
		}
	}
	
	public List<T> useFilterDistinctionObjectGeneric(List<T> sourceList, T object) {

		List<T> outPutList = new ArrayList<>();
		
		try {
			outPutList = sourceList.stream()
					.filter(T -> T == object)
					.distinct() // // Remove repetition of values.
					.collect(Collectors.toList());
			
			return outPutList;
			
		} catch (Exception e) {
			
			outPutList = sourceList;
			return outPutList;
		}
	}
}
