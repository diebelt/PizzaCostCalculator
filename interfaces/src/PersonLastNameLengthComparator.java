import java.util.Comparator;

public class PersonLastNameLengthComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        if (p1.getLastName().length() > p2.getLastName().length()) {
            return 1;
        }
        if (p1.getLastName().length() == p2.getLastName().length()) {
            return 0;
        }
        return -1;
    }
}