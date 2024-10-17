package practiceProblems;

public class FindRepeatingOfArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 10, 30};
        int num = 10;
        int count = 0;

        for(int x: arr) {
            if (x == num) {
                count = count + 1;
            }

        }
        System.out.println("10 is repeated "+" " + count +" " + "times");
    }

}
