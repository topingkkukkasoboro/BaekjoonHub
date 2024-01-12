// 현재 시간과 분이 주어지고 오븐이 작동 될 시간이 주어 진다 // 오븐이 작동될 시간을 더해서 출력하자
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 시간과 분이 주어 지면 요리해 필요한 분을 계산해라
        // ex 14시 30분이 입력되면 요리에 따른 분을 더해 시간이 나온다

        int a = scanner.nextInt(); // a는 현재 시간
        int b = scanner.nextInt(); // b는 현재 분
        int c = scanner.nextInt(); // c는 필요한 분

        int d = b + c; //현재 분과 추가해야할 분
        //d가 분이기 떄문에 최대는 59을 넘을 수 없다
        // 60분이 되면 a에 1을 추가하고 d 에서 60을 빼야한다
        // a는 23을 넘으면 0으로 변환되어야 한다

        for (; d >= 60; d -= 60){ // d는 현재 분 + 요리 분 // 분 단위는 최대가 59이므로 60이 되면 1시간으로 변환
            a++;
        }

        if (a >= 24){ // a는 시간 // 최대가 23이므로 24가 되면 -24
            a -= 24;
        }
        System.out.println(a);
        System.out.println(d);
    }
}