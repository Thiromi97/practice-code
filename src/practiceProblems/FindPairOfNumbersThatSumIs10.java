package practiceProblems;

public class FindPairOfNumbersThatSumIs10 {
    /*
    sum =10
    arr = {1,2,3,4,5,6,7,8,9,10}
     */

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 10;
        int total = 0;
        int count = arr.length;
        for(int i=0;i<count;i++){
            for(int j=0;j<=i;j++){
                total = arr[i]+arr[j];
                if(total==sum){
                    System.out.printf("(%d,%d)",arr[i] , arr[j]);
                }
            }
        }
    }
}
