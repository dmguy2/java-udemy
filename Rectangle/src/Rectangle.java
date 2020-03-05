public class Rectangle {
    private int length;
    private int width;
    private int height;
    private int volume;
   // private int counter = 0;

    public Rectangle(){}
    public Rectangle (int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public Rectangle (Rectangle rectangle){}
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public Rectangle makeNewRectangle (Rectangle rectangle){
        Rectangle rectangle1 = new Rectangle(rectangle);
        return rectangle1;
    }
    public int getVolume (Rectangle rectangle){
        rectangle.volume = rectangle.length * rectangle.width * rectangle.height;
        return rectangle.volume;
    }











}
