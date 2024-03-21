public class Triangle extends DefaultShape implements Perimeter {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double getArea(){
        //Calcualte the are of triangle using the sides
        // semiperimeter of the triangle s
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    @Override
    public double getCircumference(){
        return side1 + side2 + side3;
    }

    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
}