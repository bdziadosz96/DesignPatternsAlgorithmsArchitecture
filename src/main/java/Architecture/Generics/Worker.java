package Architecture.Generics;

public class Worker extends Person{
    public Worker(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Worker" + getName() + " | " + getAge();
    }
}
