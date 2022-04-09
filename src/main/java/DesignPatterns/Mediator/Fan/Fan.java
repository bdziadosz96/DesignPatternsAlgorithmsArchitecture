package DesignPatterns.Mediator.Fan;

class Fan {
    private Mediator mediator;
    private Integer speed;

    public Fan(Integer speed) {
        this.speed = speed;
    }

    public Fan(Mediator mediator, Integer speed) {
        this.mediator = mediator;
        this.speed = speed;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public void increaseSpeed() {
        mediator.increseSpeed();
    }

    public void showSpeed() {
        mediator.showSpeed();
    }
}
