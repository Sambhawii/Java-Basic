public class countrec {
    static int count = 0;

    static int countdig(int num) {
        if (num == 0) {
            return 0;
        }
        // small problem + cycle
        int count = countdig(num / 10);
        count = count + 1;
        return count;
    }

    public static void main(String[] args) {
        int num = 123409;
        System.out.println(countdig(num));
    }

}
