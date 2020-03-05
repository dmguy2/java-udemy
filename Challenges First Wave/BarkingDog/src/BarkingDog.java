public class BarkingDog
{

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
            return ((barking && hourOfDay < 8 && hourOfDay >= 0 || barking && hourOfDay == 23)) ? true : false;
    }

}

//    We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
//
//        In all other cases return false.
//
//        If the hourOfDay parameter is less than 0 or greater than 23 return false.