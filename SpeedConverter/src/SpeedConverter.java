public class SpeedConverter {

    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0){
            return - 1;
        }
        return Math.round(kilometersPerHour / 1.609); //math done and returned here
    }
    public static void PrintConversion (double KilometersPerHour){
        if (KilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else { long milesperhour = toMilesPerHour(KilometersPerHour);
            System.out.println(KilometersPerHour +
                    " Km/h = " + milesperhour +
                    " Mph");
        }
    }

}

