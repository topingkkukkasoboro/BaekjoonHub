import java.util.Scanner;

//  *
//   **
//  ***
// ****
//*****가 나오게 출력하는데... 이건 좀 너무 했다

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n에 정수를 스캔
        String b = ""; // b를 문자열 초기화
        String c = ""; // c를 문자열 초기화

        for (int a = (n -1) ; a >= 0; a--){ // a는 n -1이다; a가 0보다 크거나 같을때까지; a에 1씩빼라
            b += "*"; // b에는 문자열 *을 넣어라 //작은 수부터 시작 그럼은로 한개씩 시작
            for (int d = 1; d <= a; d++) // d는 1; d보다 a가 크거나 같을때까지; d에 1씩 더해라
               c += " "; // d에는 문자열 띄워쓰기를 넣어라 // 큰 수부터 시작 그럼으로 4씩 시작작
            System.out.print(c);// c를 출력
            System.out.println(b); // d를 출력
            c = "";// 문자열 c를 초기화 해라
        }

    }

}
