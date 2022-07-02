import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 2;
        System.out.println(num);

        for ( ; num < 100; num++){
            for (int i = 2; i<=100; i++){
                    if (num % i == 0){
                        break;
                    }
                    else {
                        if (i == num-1){
                            System.out.println(num);
                        }
                    }
            }
        }
    }
}
