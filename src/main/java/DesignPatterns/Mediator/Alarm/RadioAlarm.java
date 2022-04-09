package DesignPatterns.Mediator.Alarm;

class RadioAlarm extends Alarm {
    private String stamp;

    public RadioAlarm(String name) {
        super(name);
        this.stamp = "Radio Alarm beep beep";
    }

    public String getStamp() {
        return stamp;
    }
}
