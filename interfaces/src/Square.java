public class Square extends Rectangle implements Perimeter {

    public Square(double edge) {
        super(edge, edge);
    }
    @Override
    public double getPerimeter() {
        return 4 * getWidth();
    }
}