import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();


        for (int c = 0; c < T; c++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println(A + B);
        }
    }
}