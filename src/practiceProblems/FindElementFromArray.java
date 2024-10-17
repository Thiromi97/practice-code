package practiceProblems;

public class FindElementFromArray {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        int num = 30;

        for(int x:arr){
            if(x==num){
                System.out.println("Element Exists");
                break;
            }
        }
    }
}
