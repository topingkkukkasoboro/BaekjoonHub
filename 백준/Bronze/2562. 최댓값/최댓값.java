import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[9]; // 자연수를 부여
        int d = 1;

        for (int i = 0; i < 9; i++) {
            a[i] = sc.nextInt(); //  9 만큼의 랜덤숫자
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            max = Math.max(a[i], max); // 최대값 구하기 // max에 a[0]을 넣어서 비교
        }
        for (int i = 0; i < 9; i++) {
            if (a[i] != max){
                d ++;
            }else break;
        }
        System.out.println(max);
        System.out.println(d);

        }

    }