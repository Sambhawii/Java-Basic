
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int a = n;
        int r = 0;
        int sum = 0;
        double pow = 1;
        while (a > 0) {
            pow = Math.pow(a, pow);
            r = a % 10;
            sum = sum + (r * r * r);
            a = a / 10;
        }
        System.out.println(sum);
    }

}
