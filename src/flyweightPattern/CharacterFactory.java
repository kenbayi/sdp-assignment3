package flyweightPattern;

import java.util.HashMap;
import java.util.Map;

class CharacterFactory {
    private Map<String, Character> characterMap = new HashMap<>();

    public Character getCharacter(char value, String font, int size) {
        String key = value + font + size;
        Character character = characterMap.get(key);

        if (character == null) {
            character = new Character(value, font, size);
            characterMap.put(key, character);
        }

        return character;
    }
}

