package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class SortedDistinctStream<T> {

    public List<Object> returnListPerson(List<Object> A){
        List<Object> B = A.stream()
            .sorted()
            .collect(Collectors.toList());
        return B;
    }

    public List<T> returnListObject(List<T> A){
        List<T> B = A.stream()
            .sorted()
            .distinct()
            .collect(Collectors.toList());
        return B;
    }
}
