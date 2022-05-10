package DesignPatterns.State;

class FanMediumState extends State{
    private Fan fan;

    FanMediumState(final Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turn to high state");
        fan.setState(fan.getFanHighState());
    }

    public String toString() {
        return "Fan is medium state";
    }
}
