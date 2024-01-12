import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
// 4분면을 구하는 문제이다 a와 b의 수가 주어지면 해당 수는 어느 면에 해당하는지 구해야 했다
// 말 그대로 작성하면 되는 문제 였다
// 수는 양수와 음수로만 주어지기에 0으로 비교를 하면된다
        if (a > 0 && b > 0 ){
            System.out.println(1);
// a가 0보다 크고 b가 0보다 크다면 1을 출력해라
        }
        if (a<0 && b> 0){
            System.out.println(2);
// a가 0보다 작고 b가 0보다 크다면 2를 출력해라
        }
        if (a < 0 && b < 0){
            System.out.println(3);
//a가 0보다 작고 b도 0보다 작다면 3을 출력해라
        }
        if (a > 0 && b < 0){
            System.out.println(4);
// a가 0보다 크고 b가 0보다 작으면 4를 출력해라
        }
    }
}