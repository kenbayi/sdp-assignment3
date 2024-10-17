package flyweightPattern;

class TextEditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.insertText("Hello", "Arial", 12, 0, 0);
        editor.insertText("World", "Arial", 12, 0, 20);
    }
}

