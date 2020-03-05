import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        Scanner input = new Scanner(System.in);
        while (i <= 10){
            System.out.println("Enter #" + i + " of 10:");
            if(input.hasNextInt()) {
                int number = input.nextInt();
                sum += number;
                i++;
            }
            else {
                System.out.println("Invalid Value");
            }
            input.nextLine();
        }
        System.out.println("The sum of all ten inputs is: " + sum);
        input.close();
    }
}
