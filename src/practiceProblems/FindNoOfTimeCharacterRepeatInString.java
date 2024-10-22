package practiceProblems;

public class FindNoOfTimeCharacterRepeatInString {
    public static void main(String[] args) {
        String str = "selenium";
        int num = str.length();
        int count = 0;
        for(int i=0;i<num;i++){
            Character cha = str.charAt(i);
            for(int j=0;j<num;j++){
                Character cha1 = str.charAt(j);
                if(cha.equals(cha1)){
                    count++;
                }

            }
            System.out.printf("%c repeat %d times %n",cha,count);
        }

    }
}
