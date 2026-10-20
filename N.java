import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int zeros = 0;
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                zeros++;
            } else if (num > 0) {
                pos++;
            } else {
                neg++;
            }
        }

        System.out.println(zeros + " " + pos + " " + neg);
    }
}