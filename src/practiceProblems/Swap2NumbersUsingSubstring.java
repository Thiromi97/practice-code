package practiceProblems;

public class Swap2NumbersUsingSubstring {

    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "456";
        int num = str1.length() + str2.length();
        String str3 = str1.concat(str2);

        str2 = str3.substring(0,num-3);
        str1 = str3.substring(num-3,num);
        System.out.println("str1 ="+str1);
        System.out.println("str2 ="+str2);
    }
}
