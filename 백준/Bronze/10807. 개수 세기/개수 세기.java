import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n을 스캔해서 입력받자 // 정수 갯수가 될것
        int[]arr = new int[n]; // arr의 배열은 n의 수만큼의 배열 선언
        int count = 0; // 같은 숫자 저장소다

        for (int i = 0; i < n; i++) { // i가 n보다 작지않을떄까지 1씩더하고
            arr[i] = sc.nextInt(); // arr배열의 i번쨰 마다 스캔입력
            }
        int v = sc.nextInt(); // v는 같은 숫자 스캔

        for (int i = 0; i <n ; i++) { // i가 arr배열의 길이가 될때까지 // arr의 길이는  n이다
            if(v==arr[i]){ //v랑 arr의 i번째 숫자 와 같으면
                count++; // count에 1씩 더해라
            }
        }
        System.out.println(count); //count 출력
        }
    }
