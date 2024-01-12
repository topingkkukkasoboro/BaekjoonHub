// 대문자 소문자를 구분해서 클라이언트의 요구대로 진행하자
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 영수증의 총 금액
        int n = sc.nextInt(); // 물건의 종류 수
        int c = 0; // 저장소를 만듬 (a*b를할수있는)

        for (int i = 0; i < n; i++) { // i라는 값을 만들어서 n 즉 물건 종류수와 같아질때까지
            int a = sc.nextInt(); // 물건 가격
            int b = sc.nextInt(); // 물건 갯수
            c += a * b; // a*b의 값
// 이제 i가 n과 같아질때까지 a와 b를 해당 횟수만큼 수를 넣을 수 있다
        }
        if (x == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}

