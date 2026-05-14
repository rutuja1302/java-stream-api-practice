package basic;

import java.util.Arrays;
import java.util.List;

public class StreamBasicOperations {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,2,3,4,4);

        //Remove duplicate elements
        List<Integer> uniqueIntegers = numList.stream().distinct().toList();
        System.out.println("Unique Integers: "+uniqueIntegers);

        //Count total elements
        System.out.println("Total elements in og array: "+numList.stream().count());

        //Find first element
        System.out.println("First element: "+numList.stream().findFirst());

        //Find the first element in the list which is divisible by 2
        System.out.println("Fist element divisible by 2: "+numList.stream().filter(n -> n%2==0).findFirst());
        
    }
}
