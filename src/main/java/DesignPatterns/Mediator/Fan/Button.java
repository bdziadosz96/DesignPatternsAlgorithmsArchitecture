package DesignPatterns.Mediator.Fan;

class Button {
    private Mediator mediator;

    public Button() {
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.press();
    }
}
