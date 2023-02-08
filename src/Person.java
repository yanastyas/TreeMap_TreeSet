public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String detSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(age, o.age);
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}
