package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAggregationOperations {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(14,67,32,5,90);

        //Find sum of all numbers
        int sum = numList.stream().reduce(0,(a,b)->{
            return a+b;
        });
        System.out.println("Sum of all numbers: "+sum);

        //Find min in list
        Optional<Integer> min = numList.stream().min(Integer::compareTo);

        //Find max in list
        Optional<Integer> max = numList.stream().max(Integer::compareTo);

        System.out.println("Min number in list: "+min+" & max number: "+max);

        List<String> wordList = Arrays.asList("Hello"," ","World");

        //Join strings using comma
        String combinedString = wordList.stream().collect(Collectors.joining());
        System.out.println("combined string: "+combinedString);
    }
}
