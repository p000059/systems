package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class ListOrder {

    public List<Integer> streamListOrder(List<Integer> A){
        
        List<Integer> B = A.stream()
                .sorted() 
                .collect(Collectors.toList()); 
        return B;
    }

    public List<Integer> listOrder(List<Integer> A){

        A.sort((a, b) -> a.compareTo(b));

        return A;
    }
}
