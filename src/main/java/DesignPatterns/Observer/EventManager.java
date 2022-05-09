package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

class EventManager {
    private List<EventObserver> observerList = new ArrayList<>();

    void subscribe(EventObserver observer) {
        observerList.add(observer);
    }

    void unsubscribe(EventObserver observer) {
        observerList.remove(observer);
    }

    void notifySubscribers() {
        for (EventObserver eventObserver : observerList) {
            eventObserver.update();
        }
    }
}
