import org.w3c.dom.ls.LSOutput;

public class ForLoop {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }


        return true;

    }
    public static void main(String[] args) {
      int counter = 0;

        for (int i = 0; i <= 317; i ++){
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                counter++;
            }
            if (counter > 100)
            {
                break;
            }
        }
    }
}
