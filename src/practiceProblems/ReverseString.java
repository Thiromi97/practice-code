package practiceProblems;



public class ReverseString {
    public static void main(String[] args) {
        String str = "welcome";
        String rev = " ";
        int num = str.length() -1;
        for(int i=num;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        //StringBuffer contain direct reverse method
        StringBuffer str1 = new StringBuffer("LOVE");
        System.out.println(str1.reverse());

        StringBuilder str2 = new StringBuilder("HOME");
        System.out.println(str2.reverse());
    }
}
