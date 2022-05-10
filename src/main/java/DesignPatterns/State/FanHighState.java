package DesignPatterns.State;

class FanHighState extends State{
    private Fan fan;

    FanHighState(final Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan to high state");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is high state";
    }
}
