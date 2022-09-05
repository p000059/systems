package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct<T> {
	
	public List<T> useDistinctionObjectGeneric(List<T> sourceList) {

		List<T> outPutList = sourceList.stream()
				.distinct() // // Remove repetition of values.
				.collect(Collectors.toList());
		
		return outPutList;
	}
	
	public List<Integer> distinctElements(List<Integer> sourceList) {

		List<Integer> outPutList = new ArrayList<>();

		try {
			outPutList = sourceList.stream()
					.distinct() // Strip repeated numbers.
					.collect(Collectors.toList()); // Create and return new list with new values.
			
			return outPutList;

		} catch (Exception e) {

			outPutList = null;
			return outPutList;
		}
	}
}
