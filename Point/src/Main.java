public class Main {
    public static void main(String[] args) {
        Vector vector0 = new Vector(2, 3, 9,30);
        Vector vector1 = new Vector(5, 8, 4,70);

//        System.out.println(vector0.getX() + " " + vector0.getY());
//        System.out.println(vector1.getX() + " " + vector1.getY());
//        System.out.println(vector0.distance(vector1));
//        System.out.println(vector1.distance(vector0));

        System.out.println(vector0.distance());
        System.out.println(vector1.distance());
    }
}
