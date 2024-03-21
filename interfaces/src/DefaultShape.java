public abstract class DefaultShape implements Shape {

    public int compareTo(Shape s) {
        if (this.getArea() > s.getArea()) {
            return 1;
        }
        if (this.getArea() == s.getArea()) {
            return 0;
        }
        return -1;
    }
    public String toString() {
        return "Shape of type: " +getClass() + ", Area: " + getArea() + ", Circumference: "  + getCircumference();
    }
}