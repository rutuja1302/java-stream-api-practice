package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurence {
    public static void main(String[] args) {
        List<String> wordsList = Arrays.asList("java", "spring", "java");

        //Count occurrences of each word
        Map<String,Long> occurenceMap = wordsList.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("occurences of words: "+occurenceMap);

        //Find frequency of characters in a string
        String word = "banana";
        Map<Character,Long> frequencyCount = word.chars()
                                                    .mapToObj(c -> (char) c) 
                                                    .collect(Collectors.groupingBy(c->c, Collectors.counting()));
        System.out.println(frequencyCount);

        //Find duplicate elements
        List<Integer> numList = Arrays.asList(1,2,3,4,4,5,6,6);
        List<Integer> duplicates = numList.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet().stream().filter(entry -> entry.getValue()>1).map(entry -> entry.getKey()).toList();

        System.out.println("Duplicate elements: "+duplicates);
    }
}
