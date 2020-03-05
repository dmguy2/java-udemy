public class Vector {
    private double x;
    private double y;
    private double z;
    private double force;
    private double distance;

    public Vector (){}
    public Vector (double x, double y, double z, double force){
        this.x = x;
        this.y = y;
        this.z = z;
        this.force = force;
    }
    public Vector (Vector vector) {
        this.x = vector.x;
        this.y = vector.y;
        this.z = vector.z;
        this.force = vector.force;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setZ(double z) {
        this.z = y;
    }

    public double distance (){
        this.distance = Math.sqrt(
                        (this.x) * (this.x) +
                        (this.y) * (this.y) +
                        (this.z) * (this.z)
                        );
        return this.distance;
    }

    public double distance (Vector vector){
       this.distance = Math.sqrt(
                       (this.x - vector.x) * (this.x - vector.x) +
                       (this.y - vector.y) * (this.y - vector.y) +
                       (this.z - vector.z) * (this.z - vector.z)
                        );
       return (double) this.distance;
    }
    public double resultantVector (Vector vector){

    }
}
