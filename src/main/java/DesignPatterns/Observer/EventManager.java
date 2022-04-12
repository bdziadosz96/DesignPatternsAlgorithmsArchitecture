package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<EventObserver> observerList = new ArrayList<>();

    public void subscribe(EventObserver observer) {
        observerList.add(observer);
    }

    public void unsubscribe(EventObserver observer) {
        observerList.remove(observer);
    }

    public void notifySubscribers() {
        for (EventObserver eventObserver : observerList) {
            eventObserver.update();
        }
    }
}
