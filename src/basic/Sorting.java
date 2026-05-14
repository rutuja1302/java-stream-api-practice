package basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(100,34,74,4,13,45);
        
        //sort in ascending manner
        List<Integer> sortedIntegers = numberList.stream().sorted().toList();
        System.out.println("Sorted List: "+sortedIntegers);

        //sort in descending manner
        List<Integer> descIntegers = numberList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Descending List: "+descIntegers);

        List<String> words = Arrays.asList("java", "spring", "angular");

        //sort words alphabetically
        List<String> alphabeticallySortedList = words.stream().sorted().toList();
        System.out.println("Alphabet wise sorting: "+alphabeticallySortedList);

        //sort words acc to string length
        List<String> lengthWiseSortedList = words.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println("Sorted according to string length: "+lengthWiseSortedList);
    }
}
