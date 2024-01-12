class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
      int a = overwrite_string.length(); // a는 오버라이트 문장의 길이
        int b = my_string.length(); // b는 마이 스트링의 길이
        String i = my_string.substring(0, s); // i는 마이스트링 0부터 s전까지
        String j = my_string.substring((a + s),(b));
        // j는 마이스트링 (마이스트링 길이 + s) 에서 마이스트링길이 전까지

        answer += i + overwrite_string + j;
        // 마이스트링 0부터 s전까지에다가
        // 오버라이트 스트링 더하고 마이스트링(마이스트링 길이에서 s더한만큼에서 마이스트링 길이전까지)
        return answer;
    }
}