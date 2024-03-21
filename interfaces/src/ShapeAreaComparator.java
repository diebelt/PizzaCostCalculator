import java.util.Comparator;

public class ShapeAreaComparator implements Comparator <Shape>{
    public int compare(Shape o1, Shape o2) {

        if (o1.getArea() > o2.getArea()){
            return 1;

        }
        if (o1.getArea() == o2.getArea()) {
            return 0;
        }
        return -1;
    }
}