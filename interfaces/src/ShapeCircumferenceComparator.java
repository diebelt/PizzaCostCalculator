import java.util.Comparator;

public class ShapeCircumferenceComparator implements Comparator<Shape> {
    public int compare (Shape o1, Shape o2) {
        if (o1.getCircumference() > o2.getCircumference()) {
            return 1;
        }

        if (o1.getCircumference() == o2.getCircumference()) {
            return 0;
        }
        return -1;
    }
}