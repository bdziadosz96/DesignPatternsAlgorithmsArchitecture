package DesignPatterns.Memento;

public class Snapshot {
    private String text;
    private Integer cooX;
    private Integer cooY;

    public Snapshot(String text, Integer cooX, Integer cooY) {
        this.text = text;
        this.cooX = cooX;
        this.cooY = cooY;
    }

    public String getText() {
        return text;
    }

    public Integer getCooX() {
        return cooX;
    }

    public Integer getCooY() {
        return cooY;
    }
}
