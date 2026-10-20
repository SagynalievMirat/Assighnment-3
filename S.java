import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 1; count < n; i++) {
            for (int j = 0; j < i && count < n; j++) {
                sb.append(i).append(" ");
                count++;
            }
        }
        System.out.println(sb.toString().trim());
    }
}
