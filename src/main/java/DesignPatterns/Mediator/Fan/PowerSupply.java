package DesignPatterns.Mediator.Fan;

class PowerSupply {
    private Mediator mediator;
    private boolean powerState;

    public PowerSupply(Boolean powerState) {
        this.powerState = powerState;
    }

    public PowerSupply(Mediator mediator) {
        this.mediator = mediator;
    }

    public PowerSupply(Mediator mediator, Boolean powerState) {
        this.mediator = mediator;
        this.powerState = powerState;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean getPowerState() {
        return powerState;
    }

    public void setPowerState(Boolean powerState) {
        this.powerState = powerState;
    }

    public void powerOff() {
        mediator.powerOff();
    }

    public void powerOn() {
        mediator.powerOn();
    }

    public void showPowerState() {
        mediator.showPowerState();
    }


}
