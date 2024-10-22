public class StringVsStringBuilder {

    public static void main(String[] args) {
        String str = "welcome";
        str.concat("to java");
        System.out.println(str); // immutable,do not change original value

        StringBuilder str1 = new StringBuilder("welcome");
        str1.append("to java");
        System.out.println(str1);

        //String comparison
        String s1 = "welcome";
        String s2 ="welcome";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
