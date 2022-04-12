package DesignPatterns.Observer;

public class Test {
    public static void main(String[] args) {
        EmailSubscriber emailSubscriber = new EmailSubscriber("Tomek");
        PhoneSubscriber phoneSubscriber = new PhoneSubscriber("Kuba");

        EventManager eventManager = new EventManager();
        eventManager.subscribe(emailSubscriber);
        eventManager.subscribe(phoneSubscriber);
        eventManager.notifySubscribers();

        eventManager.unsubscribe(phoneSubscriber);
        eventManager.notifySubscribers();
    }
}
