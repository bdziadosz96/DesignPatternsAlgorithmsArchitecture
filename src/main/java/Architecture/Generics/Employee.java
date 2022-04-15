package Architecture.Generics;

public class Employee extends Person{
    public Employee(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Employee + " + getName() + " | " + getAge();
    }

    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
