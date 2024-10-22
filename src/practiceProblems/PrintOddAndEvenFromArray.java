package practiceProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintOddAndEvenFromArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        ArrayList <Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for(int x:arr){
            if(x%2==0){
                even.add(x);
            }else{
                odd.add(x);
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }

}
