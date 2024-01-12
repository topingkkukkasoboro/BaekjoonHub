import java.util.Scanner; // 스캐너 적으면 나온다

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 스캐너가 가능하게 적음
        long a = sc.nextLong(); // long이 되는지 한번 해봄 보통은 int로 사용
        long b = sc.nextLong();

        System.out.println(a + b);
    }
} // 출력을 하면 수를 입력할 수 있음 수를 입력하면 a에 한번 b에 한번 들어가면서 +한 값이 나옴
