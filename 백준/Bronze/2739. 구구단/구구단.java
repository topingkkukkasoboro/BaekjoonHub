import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 구구단 문제 // 수가 주어지면 1~9까지 곱한 값을 출력하자
        for (int a = 1; a <= 9 ; a++){
            System.out.printf("%d * %d = %d%n", n, a, n * a);
        }

    }
}
