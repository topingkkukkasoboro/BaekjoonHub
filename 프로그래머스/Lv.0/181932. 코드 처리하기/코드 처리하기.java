class Solution {
     public String solution(String code) {
   String answer = "";
        int mode = 0; // 시작할 때 mode는 0
        StringBuilder ret = new StringBuilder(); // StringBuilder를 사용하여 문자열을 효율적으로 처리

        for (int idx = 0; idx < code.length(); idx++) {
            if (mode == 0) {
                if (code.charAt(idx) != '1') {
                    if (idx % 2 == 0) {
                        ret.append(code.charAt(idx));
                    }
                } else {
                    mode = 1;
                }
            } else { // mode == 1
                if (code.charAt(idx) != '1') {
                    if (idx % 2 != 0) {
                        ret.append(code.charAt(idx));
                    }
                } else {
                    mode = 0;
                }
            }
        }

        if (ret.length() == 0) {
            answer = "EMPTY";
        } else {
            answer = ret.toString();
        }
        return answer;
    }
}