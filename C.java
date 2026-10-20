import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i * i <= b; i++) {
            if (i * i >= a) {
                System.out.print(i * i + " ");
            }
        }
    }
}