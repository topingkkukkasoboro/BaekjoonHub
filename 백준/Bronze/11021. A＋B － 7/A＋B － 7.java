import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int c = 0;

        for (int i = 1; i <= t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            c = a+b;
            System.out.println("Case #"+i+": "+c);
        }

    }

}