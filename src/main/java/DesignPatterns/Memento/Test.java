package DesignPatterns.Memento;

public class Test {
    public static void main(String[] args) {
        EditorCaretaker caretaker = new EditorCaretaker();
        Editor editor = new Editor("Test", 120,120);
        caretaker.save(editor);
        System.out.println("Editor " + editor);
        editor.setText("Witam2");
        caretaker.save(editor);
        System.out.println("Editor " + editor);
        editor.setText("Witam3");
        caretaker.save(editor);
        System.out.println("Editor " + editor);
        caretaker.revert(editor);
        System.out.println("Editor " + editor);
        caretaker.revert(editor);
        System.out.println("Editor " + editor);
        caretaker.revert(editor);

    }
}
