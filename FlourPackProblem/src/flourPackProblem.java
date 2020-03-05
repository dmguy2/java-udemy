public class flourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
       bigCount *= 5;
        if (bigCount + smallCount < goal || goal < 0) {
            return false;
        }
        if (bigCount % goal == 0 || goal <= smallCount) {
            return true;
        }
        int remainder = goal;
        while (remainder > 0) {
            remainder -= 5;
        }
        remainder += 5;
        if (smallCount >= remainder) {
            return true;
        }

        return false;
    }
}
