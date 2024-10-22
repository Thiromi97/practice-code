import java.util.Scanner;

public class TakingInputFromKeyboard {

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        Integer num = scan.nextInt();
        System.out.println(num);
    }
}
