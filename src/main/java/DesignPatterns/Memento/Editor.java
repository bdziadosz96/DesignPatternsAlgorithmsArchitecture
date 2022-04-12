package DesignPatterns.Memento;

public class Editor {
    private String text;
    private Integer cooX;
    private Integer cooY;

    public Editor(String text, Integer cooX, Integer cooY) {
        this.text = text;
        this.cooX = cooX;
        this.cooY = cooY;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getCooX() {
        return cooX;
    }

    public void setCooX(Integer cooX) {
        this.cooX = cooX;
    }

    public Integer getCooY() {
        return cooY;
    }

    public void setCooY(Integer cooY) {
        this.cooY = cooY;
    }

    public Snapshot createSnapshot() {
        return new Snapshot(this.text, this.cooX, this.cooY);
    }

    public void revert(Snapshot snapshot) {
        this.text = snapshot.getText();
        this.cooX = snapshot.getCooX();
        this.cooY = snapshot.getCooY();
    }

    @Override
    public String toString() {
        return "Editor{" +
                "text='" + text + '\'' +
                ", cooX=" + cooX +
                ", cooY=" + cooY +
                '}';
    }
}

