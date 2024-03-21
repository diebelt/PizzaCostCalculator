import java.util.Comparator;

public class PersonFirstNameComparator implements Comparator <Person> {
    public int compare(Person o1, Person o2) {
        int firstNameComparison = o1.getFirstName().compareTo(o2.getFirstName());
        if (firstNameComparison !=0) {
            return firstNameComparison;
        }
        else {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }
}
