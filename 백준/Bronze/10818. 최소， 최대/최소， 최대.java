import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int max = Integer.MIN_VALUE; // 최솟값을 Integer.MAX_VALUE로 초기화
        int min = Integer.MAX_VALUE; // 최댓값을 Integer.MIN_VALUE로 초기화

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            
            // 최솟값 갱신
            min = Math.min(a[i], min);

            // 최댓값 갱신
            max = Math.max(a[i], max);
        }

        System.out.println(min + " " + max);
        sc.close();
    }
}