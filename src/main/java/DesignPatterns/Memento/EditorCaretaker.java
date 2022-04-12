package DesignPatterns.Memento;

import java.util.Stack;

public class EditorCaretaker {
    private Stack<Snapshot> editorHistory = new Stack<>();

    public void save(Editor editor) {
        editorHistory.push(editor.createSnapshot());
    }

    public void revert(Editor editor) {
        editor.revert(editorHistory.pop());
    }
}
