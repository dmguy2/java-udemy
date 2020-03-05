public class MinutesToDaysAndYears {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.print("Invalid Value");
        } else {


            long years = minutes / 525600;
            long days = (minutes % 525600) / 1440;

            if (minutes < 10) {
                System.out.print("0" + minutes + " min = ");
            } else {
                System.out.print(minutes + " min = ");
            }


            if (years < 10) {
                System.out.print("0" + years + " y and ");
            } else {
                System.out.print(years + " y and ");
            }


            if (days < 10) {
                System.out.print("0" + days + " d");
            } else {
                System.out.print(days + " d");
            }
        }

    }
}
