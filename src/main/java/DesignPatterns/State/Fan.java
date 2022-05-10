package DesignPatterns.State;

class Fan {
    State fanOffState;
    State fanLowState;
    State fanMediumState;
    State fanHighState;

    State state;

    Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMediumState = new FanMediumState(this);
        fanHighState = new FanHighState(this);

        state = fanOffState;
    }

    public void changeState() {
        state.handleRequest();
    }

    State getFanLowState() {
        return fanLowState;
    }

    State getFanMediumState() {
        return fanMediumState;
    }

    State getFanHighState() {
        return fanHighState;
    }

    State getState() {
        return state;
    }

    void setState(final State state) {
        this.state = state;
    }

    State getFanOffState() {
        return fanOffState;
    }

    @Override
    public String toString() {
        return state.toString();
    }
}
