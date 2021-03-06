package DesignPatterns.Mediator.Alarm;

class KitchenAlarm extends Alarm {
    private String description;

    KitchenAlarm(String name) {
        super(name);
        this.description = "Kitchen alarm from the side";
    }

    public String getDescription() {
        return description;
    }
}
