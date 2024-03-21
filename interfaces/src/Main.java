import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {
        Shape c = new Circle(10);
        Shape r1 = new Rectangle(3, 4);
        Shape r2 = new Rectangle(0.1, 20);
        Square s = new Square(5);
        Triangle t = new Triangle (5, 7, 5);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(c);
        shapes.add(r1);
        shapes.add(r2);
        shapes.add(s);
        shapes.add(t);

        System.out.println("Unsorted shapes");
        printList(shapes);

        Collections.sort(shapes);
        System.out.println("Sorted shapes");
        printList(shapes);

        Collections.sort(shapes, new ShapeCircumferenceComparator());
        System.out.println("Sorted shapes by Circumference");
        printList(shapes);

        Collections.sort(shapes, new ShapeAreaComparator());
        System.out.println("Sorted shapes by Area");
        printList(shapes);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(3);
        numbers.add(9);
        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("After sorting");
        Collections.sort(numbers);
        for (Integer number : numbers) {
            System.out.println(number);
        }

        Person p1 = new Person("Eduard", "Munch");
        Person p2 = new Person("Eduard", "Stradivarius");
        Person p3 = new Person("Michael", "Keaton");
        Person p4 = new Person("Javier", "Bil");

        List<Person> persons = new LinkedList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        for (Person p: persons){
            System.out.println(p);
        }

        Collections.sort(persons, new PersonFirstNameComparator());
        System.out.println("*** After sorting by first name ***");
        for (Person p: persons){
            System.out.println(p);
        }

        Collections.sort(persons, new PersonLastNameComparator());
        System.out.println("*** After sorting by last name ***");
        for (Person p: persons){
            System.out.println(p);
        }

        Collections.sort(persons, new PersonLastNameLengthComparator());
        System.out.println("*** After sorting by last name length ***");
        for (Person p: persons){
            System.out.println(p);
        }
    }
    public static void printList(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
