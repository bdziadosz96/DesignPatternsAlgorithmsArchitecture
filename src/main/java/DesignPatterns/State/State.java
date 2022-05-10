package DesignPatterns.State;

abstract class State {
    public void handleRequest() {
        throw new IllegalStateException("Illegal state");
    }
}
