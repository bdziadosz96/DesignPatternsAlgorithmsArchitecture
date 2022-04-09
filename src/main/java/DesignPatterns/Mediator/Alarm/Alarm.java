package DesignPatterns.Mediator.Alarm;

abstract class Alarm {
    private String name;

    public Alarm(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
