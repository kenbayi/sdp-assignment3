package flyweightPattern;

class Character {
    private char value;  // Intrinsic state
    private String font; // Intrinsic state
    private int size;    // Intrinsic state

    public Character(char value, String font, int size) {
        this.value = value;
        this.font = font;
        this.size = size;
    }

    public void display(int x, int y) {  // Extrinsic state: position
        System.out.println("Character: " + value + " at position (" + x + ", " + y + ") with font: " + font + " and size: " + size);
    }
}

