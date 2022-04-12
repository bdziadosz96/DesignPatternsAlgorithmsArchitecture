package DesignPatterns.Observer;

public class PhoneSubscriber implements EventObserver{
    private String name;

    public PhoneSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + " at " + PhoneSubscriber.class.getName() + " is phone subscribing");
    }
}
