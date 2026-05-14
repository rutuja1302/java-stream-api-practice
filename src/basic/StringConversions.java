package basic;

import java.util.Arrays;
import java.util.List;

public class StringConversions {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "spring", "angular");

        //Convert all strings to uppercase
        List<String> upperStrings = words.stream().map(String::toUpperCase).toList();
        System.out.println("String conversion to upper case: "+upperStrings);

        //Find length of each string
        List<Integer> lengthList = words.stream().map(String::length).toList();
        System.out.println("Length of each word: "+lengthList);
    }
}
