
//calculate the year is leap year or not
import java.util.Scanner;

class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year = sc.nextInt();
        sc.close();

        if (year % 4 == 0) {
            System.out.println(year + ":leap year");
        } else {
            System.out.println(year + ":not a leap year");
        }

    }
}