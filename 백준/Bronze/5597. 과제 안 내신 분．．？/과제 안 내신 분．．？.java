
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] number = new int[30]; // 번호의 최대 값은 30
		
		
		for(int i = 0; i < 28; i++) {
			int num = sc.nextInt();
			number[num-1] = 1; // 배열 순서니까 []사용 
			// 인덱스는 0부터 세리지만 사람번호는 1부터 세리니 1씩 차감해서 똑같이한다
			}
		
		for(int i = 0; i < 30; i++) {
			if(number[i]==0) // int형 배열에 안들어 갔으면 0 으로 표기
				//즉 0을 찾으면 된다
				System.out.println(i+1); // 배열이 1이 마이너스니 다시 1을 더해서 출력
		}
		
	}
}
