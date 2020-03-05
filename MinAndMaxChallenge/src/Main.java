import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int min = 0;
        int max = 0;
        int num = 0;
        int i   = 1;
        Scanner input = new Scanner(System.in);
        do {
            if (i == 1) {
                System.out.print("Enter Number: ");
                num = input.nextInt();
                min =  num;
                max = num;
            }
            System.out.print("Enter Number: ");
            num = input.nextInt();
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
            System.out.println("Your min is " + min + " and your max is " + max);
            System.out.println("Enter number: ");
            i = 0;

        }
        while (input.hasNextInt());
        input.close();

    }
}
