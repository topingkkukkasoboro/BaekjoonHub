import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
      if ( n % 10 == 0 || n % 10 == 2 || n % 10 == 4 || n % 10 == 6 || n % 10 == 8){
            System.out.println(n + " is even");
        } else if (n % 10 == 1 || n % 10 == 3 || n % 10 == 5 || n % 10 == 7 || n % 10 == 9){
            System.out.println(n + " is odd");
        }
    }
}