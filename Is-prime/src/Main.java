import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can check");
        int num = scanner.nextInt();
        boolean check = true;
        if (num<2){
            System.out.println(num+" khong phai la so nguyen to");
        }else {
            int i = 2;

            while ( i < num){
                if (num % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
        }

        if(check){
            System.out.println(num +" la so nguyen to");
        }else {
            System.out.println(num+" khong la so nguyen to");
        }

    }
}
