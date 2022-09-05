package Stream;

import java.util.List;

public class Count<T> {

	public Long countsListElements(List<Integer> sourceList) {

		Long outPutList = sourceList
				.stream()
				.count(); // Count how many elements are in the list.

		return outPutList;
	}
	
	public Long countsListElementsGeneric(List<T> sourceList) {

		Long outPutList = sourceList
				.stream()
				.count(); // Count how many elements are in the list.

		return outPutList;
	}
}
