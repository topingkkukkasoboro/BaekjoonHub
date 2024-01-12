import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String b = "";

        for (int a = 0; a < n; a++){
            b += "*";
            System.out.println(b);
        }

    }

}