import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 0;
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        choice = input.nextInt();

        String str = "";
        switch (choice){
            case 1:
                for (int i = 0; i<4;i++){
                    for (int j =0; j<15; j++){
                        str += "*";
                    }System.out.println(str);
                    str = "";
                }
                break;
            case 2:
                for (int i=0; i<=5; i++){
                    for (int j = 0; j <= i; j++){
                        str += "*";
                    }System.out.println(str);
                    str ="";
                }
                break;
            case 3:
                for(int i = 7;i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        str += "*";
                    }System.out.println(str);
                    str ="";
                }
                break;
            case 4:
                System.out.println("Bye bye");
            default:
                System.out.println("???");


        }
    }
}
