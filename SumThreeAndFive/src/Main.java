public class Main {
    public static void main(String[] args) {
        int num = 0;
        int counter = 1;
        for (int j = 1; j <= 1000; j++) {


            if ((j % 3 == 0) && (j % 5 == 0)) {

                    num = num + j;
                    System.out.println(counter + " number is " + j);
                    ;
                    counter ++;
                    if (counter > 6){
                        break;
                    }


            }
        }
        System.out.println("Your current sum is " + num);

    }
}
