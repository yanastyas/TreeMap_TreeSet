import java.util.Comparator;

public class PersonSurnameComparator implements Comparator<Person> {
    public int number;

    public PersonSurnameComparator(int number) {
        this.number = number;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] surname1 = o1.detSurname().split("\\P{IsAlphabetic}+");
        String[] surname2 = o2.detSurname().split("\\P{IsAlphabetic}+");
        int surnameLength1 = Math.min(surname1.length, number);
        int surnameLength2 = Math.min(surname2.length, number);
        int surnameCompare = Integer.compare(surnameLength2, surnameLength1);
        if (surnameCompare == 0) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else {
            return surnameCompare;
        }
    }
}
