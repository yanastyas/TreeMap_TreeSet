
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add((new Person("Алёна", "Панченко", 62)));
        people.add((new Person("Камила", "Адуева", 39)));
        people.add((new Person("Наталья", "Бабкина", 45)));
        people.add((new Person("Галина", "Виноградская-Козулина", 57)));
        people.add((new Person("Илья", "Конник", 33)));
        Comparator<Person> comparator = (Person o1, Person o2) -> {
            String[] surname1 = o1.getSurname().split("\\P{IsAlphabetic}+");
            String[] surname2 = o2.getSurname().split("\\P{IsAlphabetic}+");
            int surnameLength1 = Math.min(surname1.length, 2);
            int surnameLength2 = Math.min(surname2.length, 2);
            int surnameCompare = Integer.compare(surnameLength2, surnameLength1);
            if (surnameCompare == 0) {
                return Integer.compare(o2.getAge(), o1.getAge());
            } else {
                return surnameCompare;
            }
        };
        Collections.sort(people, comparator);
        System.out.println(people);
    }
}