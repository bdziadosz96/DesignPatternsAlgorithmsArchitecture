package DesignPatterns.State;

class FanOffState extends State {
    private Fan fan;

    FanOffState(final Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turn to low state");
        fan.setState(fan.getFanLowState());
    }

    public String toString() {
        return "Fan is off";
    }
}
