import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // 첫번째 주사위 수
        int b = scanner.nextInt(); // 두번째 주사위 수
        int c = scanner.nextInt(); // 세번째 주사위 수
        int result = 0; // 정답

        // 같은 눈 3개 나오면 10000원 + (같은 숫자 x 1000원)
        // 같은 눈 2개 나오면 1000원 + (같은 숫자 x 100원)
        // 다 다들 눈이면 가장 큰 수 x 100원

        if (a == b && b == c) {  // 3개 다 같은 눈일때
            result = 10000 + (a * 1000);
            System.out.println(result);

        }
        if (a == b && a != c) { // 2개가 같은 눈일때 // a랑 b가 같을때
                result = 1000 + a * 100;
                System.out.println(result);
        }
        if (b == c && a != b) { // 2개가 같은 눈일대 // b랑 c가 같을때
                result = 1000 + b * 100;
                System.out.println(result);
        }
        if (a == c && a != b){ // 2개가 같은 눈일때 // a랑 c가 같을때
                result = 1000 + c * 100;
                System.out.println(result);
        }
        if (a != b && a != c && b != c){ // 3개 다 다른 눈일때
            if ( a > b && a > c){ // a가 b보다 크고 a가 c보다 클때
                System.out.println(result = a * 100); 
            } else if (b > a && b > c) { // b가 a보다 크고 b가 c보다 클때
                System.out.println(result = b * 100);
            } else if (c > a && c > b) { // c가 a보다 크고 c가 a보다 클때
                System.out.println(result = c * 100);
            }
        }
    }
}