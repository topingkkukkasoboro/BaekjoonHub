class Solution {
    public int solution(int n) {
	int answer = 0;
		int result = 0;

		if (n % 2 == 0) { // 이건 짝수다
			for (int j = 0; j <= n; j += 2) {
				result += (j) * (j);
			} return result;

		} else  { // 이건 홀수다
			for (int i = 1; i <= n; i += 2) {
				answer += i;
			}
		}
		return answer;
		
	}
}