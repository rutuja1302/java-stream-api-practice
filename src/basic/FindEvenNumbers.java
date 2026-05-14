package basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbers {
    public static void main(String[] args){
        //ArrayList Example
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenNums = nums.stream().filter(n -> n%2==0).collect(Collectors.toList());
        System.out.println("Even Numbers: "+evenNums);

        //Primitives Array Example
        int[] numArray = {7,8,9,10,11,12};
        int[] evenNumArray = Arrays.stream(numArray).filter(n -> n%2==0).toArray();
        System.out.println("Even Numbers: "+Arrays.toString(evenNumArray));

        //Converting List to Array
        int[] evenNumArray2 = nums.stream().filter(n -> n%2==0).mapToInt(Integer::intValue).toArray();
        System.out.println("Even Numbers: "+Arrays.toString(evenNumArray2));
    }
}
