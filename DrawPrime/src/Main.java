import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count =0;
        System.out.println("Nhap so luong SNT can in ra man hinh");
        int numbers = input.nextInt();
        int a = 2;
        int i = 2;
        while (count < numbers){
            if (a == 2){
                System.out.println(a);
                count++;
            }
            if (a % i == 0){
                a++;
            }
            else {
                i++;
                if (i==a){
                    System.out.println(a);
                    count++;
                    a++;
                    i=2;
                }

            }
        }
    }
}
