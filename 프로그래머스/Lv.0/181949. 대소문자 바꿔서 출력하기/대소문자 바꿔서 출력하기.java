import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for (int i = 0; i < a.length();i++){
            // i가 a 배열의 길이가 될때까지 i증가
            char b = a.charAt(i);

            if (Character.isLowerCase(b)){
                answer += Character.toUpperCase(b);
            }else{
                answer += Character.toLowerCase(b);
            }
        }
        System.out.println(answer);

    }
}