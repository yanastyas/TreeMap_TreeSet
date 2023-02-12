
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add((new Person("Алёна", "Панченко", 62)));
        people.add((new Person("Камила", "Адуева", 17)));
        people.add((new Person("Наталья", "Бабкина", 45)));
        people.add((new Person("Галина", "Виноградская-Козулина", 57)));
        people.add((new Person("Илья", "Конник", 13)));
        people.removeIf(person -> person.getAge()<18);
        Collections.sort(people, new PersonSurnameComparator(2));
        System.out.println(people);
    }
}