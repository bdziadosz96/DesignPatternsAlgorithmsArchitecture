package Architecture.Generics;

public class Person {
    private String name;
    private Integer age;

    public Person(final String name, final Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
