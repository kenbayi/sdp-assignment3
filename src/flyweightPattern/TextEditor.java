package flyweightPattern;

class TextEditor {
    private CharacterFactory characterFactory;

    public TextEditor() {
        characterFactory = new CharacterFactory();
    }

    public void insertText(String text, String font, int size, int x, int y) {
        for (char ch : text.toCharArray()) {
            Character character = characterFactory.getCharacter(ch, font, size);
            character.display(x, y);
            x += 10;  // Incrementing position
        }
    }
}

