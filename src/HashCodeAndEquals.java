import java.util.Objects;

public class HashCodeAndEquals {

    private String name;
    private int age;

    public HashCodeAndEquals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        HashCodeAndEquals person1 = new HashCodeAndEquals("Alice", 30);
        HashCodeAndEquals person2 = new HashCodeAndEquals("Alice", 30);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // true
        System.out.println("person1.hashCode() == person2.hashCode(): " + (person1.hashCode() == person2.hashCode())); // true
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HashCodeAndEquals person = (HashCodeAndEquals) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "HashCodeAndEquals{" +
                "age=" + age +
                ", name='" + name + "'}";
    }
}
