
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int c = 0;

        for (int i = 1; i <= t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            c = a+b;
            System.out.println("Case #"+i+": "+ a + " + " + b + " = " + c);
//방금 문제보다 더 아름답게 해본다고 하였다?
//("Case #"+i+": "+ a + " + " + b + " = " + c) 이걸 해석하면 Case #1: 1 + 1 = 2 이런식으로 나온다
// :나 +에 띄워쓰기를 추가하여 출력 될때 띄워쓰기도 표현할 수 있다다
        }

    }

}
