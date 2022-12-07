
//to find the HCF and LCM of two numbers
import java.util.Scanner;

public class Hcf_lcm {
    public static void main(String[] args) {
        int temp, temp1, temp2, hcf, lcm;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no.");
        int A = sc.nextInt();
        System.out.println("enter second no.");
        int B = sc.nextInt();
        sc.close();

        temp1 = A;
        temp2 = B;

        while (temp2 != 0) {
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }

        hcf = temp1;
        lcm = (A * B) / hcf;

        System.out.println("HCF of input numbers: " + hcf);
        System.out.println("LCM of input numbers: " + lcm);
    }

}
