import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m == 45){
            System.out.println(h);
            System.out.println(0);
        }
        if ((m > 45)){
            System.out.println(h);
            System.out.println(m-45);
        } else if (m < 45) {
            h = h-1;
            if(h<0){
                h = 23;
            }
            System.out.println(h);
            System.out.println(m + 60 - 45);


        }


    }
}

