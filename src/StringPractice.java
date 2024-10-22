public class StringPractice {
    /*
    String characters are case-sensitive
    CharAt use to get characters
    String is immutable (cannot change)
    StringBuffer , StringBuilder is mutable
     */

    public static void main(String[] args) {
        String s1 = "welcome";
        String s2 = "home";
        String s4 = "dear";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2).concat(s4));
        System.out.println(s3.length());
        String s6 = "     welcome home ";
        System.out.println(s6);
        System.out.println(s6.trim());// remove space left and right

        // get a character from string
        System.out.println(s2.charAt(2));

        //check substring in string (true or false)
        System.out.println(s3.contains("welcome"));
        System.out.println(s3.contains("WELCOME"));


        //compare 2 strings (equals() , equalsIgnoreCase()
        String s8 = "Country";
        String s9 = "Country";
        System.out.println(s8.equals(s9));
        System.out.println(s9.equals(s8));
        System.out.println(s8.equals("Country"));

        //equalsIgnoreCase not case-sensitive, it ignores lower and upper characters
        System.out.println(s8.equalsIgnoreCase("cOUNTRY"));

        //replace() - replace single or multiple or sequence of characters
        String s = "Hello Welcome To Selenium Java Functional Automation Course";
        System.out.println(s.replace("e","x"));

        String str = "Selenium Java Selenium Python";
        System.out.println(str.replace("Selenium","Playwright"));

        // extract substring from main string
        String str1 = "Hello World";
        System.out.println(str1.substring(0,5));

        //toUpperCase() , toLowerCase()
        String str2 = "Happy";
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());

        //split() - split the string in to multiple parts based on delimiter
        String str3 = "thiromi@gmail.com";
        String[] a = str3.split("@");
        System.out.println(a[0]);
        System.out.println(a[1]);

        String st = "$15,89,000";
        st = st.replace("$","");
        st = st.replace(",","");
        System.out.println(st.trim());

    }





}
