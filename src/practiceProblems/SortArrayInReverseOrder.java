package practiceProblems;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayInReverseOrder {

    public static void main(String[] args) {
        //print numbers in descending order(reverse order)
        Integer[] arr = {40,78,56,23,10,34};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

        //print numbers in ascending order
        int[] arr1 = {8,3,5,1};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
