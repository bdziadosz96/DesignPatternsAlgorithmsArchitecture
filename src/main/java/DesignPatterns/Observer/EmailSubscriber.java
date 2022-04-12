package DesignPatterns.Observer;

public class EmailSubscriber implements EventObserver{
    private String name;

    public EmailSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + " at " + EmailSubscriber.class.getName() + " is email subscribing");
    }
}
