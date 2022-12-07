
//reverse of two numbers
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no to get reverse");
        int n = sc.nextInt();
        sc.close();

        int reverse = 0;
        int remender;

        while (n > 0) {

            remender = n % 10;
            reverse = (reverse * 10) + remender;
            n = n / 10;
        }

        System.out.println(reverse);
    }
}
