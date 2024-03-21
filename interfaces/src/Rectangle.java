public class Rectangle extends DefaultShape {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return width * height;
    }

    public double getWidth(){
        return width;
    }

    public double getCircumference() {
        return 2 * (width + height);
    }
}