import java.util.Comparator;

public class PersonSurnameComparator implements Comparator<Person> {
    protected int maxWord;

    public PersonSurnameComparator(int maxWord) {
        this.maxWord = maxWord;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] surname1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        String[] surname2 = o2.getSurname().split("\\P{IsAlphabetic}+");
        int surnameLength1 = Math.min(surname1.length, maxWord);
        int surnameLength2 = Math.min(surname2.length, maxWord);
        int surnameCompare = Integer.compare(surnameLength2, surnameLength1);
        if (surnameCompare == 0) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else {
            return surnameCompare;
        }
    }
}
