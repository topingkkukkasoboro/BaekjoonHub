import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String i = "";

        for (int b = 0;b < a; a -= 4){
            i += "long ";
        }
        System.out.println(i + "int");
    }

}