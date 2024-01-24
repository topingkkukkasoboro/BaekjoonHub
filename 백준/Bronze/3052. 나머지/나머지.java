import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] number = new int[10]; // 10개짜리 배열 생성
		int answer = 0;

		for (int i = 0; i < 10; i++) {
			number[i] = sc.nextInt() % 42; // 입력받는 값을 42로 나눈 나머지
		}

		for (int i = 0; i < 10; i++) {
			int num =0; // num이 돌아올때마다 초기화 시킨다
			for (int j = i+1; j < 10; j++) {//i와 j(i+1)을 비교
				if (number[i] == number[j]) {
					num++;// 값이 같다면 num에 1씩더하는데
//42와 82가 입력이 되어서 42로 나눈 나머지의 값은 두개다 0
//number 배열의 0번째 1번쨰를 비교했을때 값이 같으니 num만 더한다
//39와 40을 입력받으면 42로 나눈 남저니는 39와 40
//같지 않기 때문에 num을 증가시키지 않았고
// answer 값을 1증가
				}
			}
			if(num ==0) { // num이 증가 되지 않고 0일경우 
				answer++; // answer을 증가 시킨다
				// answer의 값이 중복된 갯수
			}
		}
		System.out.println(answer);
	}
}