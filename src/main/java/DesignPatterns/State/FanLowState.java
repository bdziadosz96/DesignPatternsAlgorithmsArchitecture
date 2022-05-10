package DesignPatterns.State;

class FanLowState extends State {
    private Fan fan;

    FanLowState(final Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turn to medium state");
        fan.setState(fan.getFanMediumState());
    }

    public String toString() {
        return "Fan is low state";
    }
}
