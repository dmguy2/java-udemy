public class DiagonalStar
{
    public static void printSquareStar(int number)
    {
        bookendLines(number);
        interiorLines(number);
        bookendLines(number);
    }
    public static void bookendLines (int number){
        for (int j = number; j > 0; j--){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void interiorLines (int number){

        
        
        
        for (int rowNumber = 1; rowNumber <= (number - 2); rowNumber ++){
            System.out.print("*");
            for (int columnNumber = 1; columnNumber <= (number - 2); columnNumber ++){
                if (columnNumber + rowNumber == (number - 1 )){
                    System.out.print("*");
                }
                else if (rowNumber == columnNumber){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }System.out.print("*");
            System.out.print("\n");
        }
    }
}
