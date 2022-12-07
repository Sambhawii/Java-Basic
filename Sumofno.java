
//SUM OF TWO NUMBERS
import java.util.Scanner;

class Sumofno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no:");
        int a = sc.nextInt();
        System.out.print("Enter second no:");
        int b = sc.nextInt();
        sc.close();

        int d = a + b;
        System.out.println(d);
    }
}