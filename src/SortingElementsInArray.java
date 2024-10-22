import java.util.Arrays;

public class SortingElementsInArray {

    public static void main(String[] args) {

        int[] arr = {300,450,600,100,220};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] arr2 = {"Abc","Bac","Cds"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
