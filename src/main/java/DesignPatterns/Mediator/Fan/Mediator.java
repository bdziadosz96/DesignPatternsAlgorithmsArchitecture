package DesignPatterns.Mediator.Fan;

class Mediator {
    private Button button;
    private Fan fan;
    private PowerSupply powerSupply;

    public Mediator(Button button, Fan fan, PowerSupply powerSupply) {
        this.button = button;
        this.fan = fan;
        this.powerSupply = powerSupply;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void press() {
        System.out.println("Clicked button!");
    }

    public void powerOff() {
        powerSupply.setPowerState(Boolean.FALSE);
    }

    public void increseSpeed() {
        fan.setSpeed(fan.getSpeed() + 10);
    }

    public void powerOn() {
        powerSupply.setPowerState(Boolean.TRUE);
    }

    public void showSpeed() {
        System.out.println("Fan speed is: " + fan.getSpeed());
    }

    public void showPowerState() {
        System.out.println("Power state is " + powerSupply.getPowerState());
    }
}
