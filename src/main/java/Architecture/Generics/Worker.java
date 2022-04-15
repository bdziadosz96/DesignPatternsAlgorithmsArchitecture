package Architecture.Generics;

class Worker extends Person{
    Worker(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Worker" + getName() + " | " + getAge();
    }
}
