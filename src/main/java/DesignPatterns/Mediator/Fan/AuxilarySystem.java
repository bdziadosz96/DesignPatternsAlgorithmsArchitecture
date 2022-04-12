package DesignPatterns.Mediator.Fan;

class AuxilarySystem {
    public static void main(String[] args) {
        Button button = new Button();
        Fan fan = new Fan(10);
        PowerSupply powerSupply = new PowerSupply(Boolean.TRUE);
        Mediator mediator = new Mediator(button,fan,powerSupply);

        mediator.press();
        mediator.powerOff();
        mediator.showPowerState();
        mediator.powerOn();
        mediator.showPowerState();
        mediator.showSpeed();
        mediator.increseSpeed();
        mediator.showSpeed();
        mediator.powerOff();
        mediator.showPowerState();
    }
}
