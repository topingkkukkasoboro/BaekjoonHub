import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // a는 1보다 크고 10000보다 같거나 작다
        int b = 0;
        int c = 0;

        for (; b <= a; b++){ // b가 a와 같아질때까지 (뭘?) b에 1씩 더해라
            c = b + c; // c에다가 b + c를 대입해라 (언제까지?) b가 a와 같아질떄까지
        }
        System.out.println(c); // c 뽑아라
        }


    }
