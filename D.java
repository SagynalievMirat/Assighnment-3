import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int d = sc.nextInt();

        int count = 0;
        while (x > 0) {
            if (x % 10 == d) {
                count++;
            }
            x /= 10;
        }

        System.out.println(count);
    }
}
