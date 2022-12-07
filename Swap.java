
//swapping of two numbers
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no");
        int num1 = sc.nextInt();
        System.out.println("enter second no");
        int num2 = sc.nextInt();
        sc.close();

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.print("after swapping no is" + num1 + "and" + num2);
    }
}
