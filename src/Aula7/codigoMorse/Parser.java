package Aula7.codigoMorse;

import java.util.AbstractMap;
import java.util.Map;

public class Parser {
    private final Map<String, String> dicionario = Map.ofEntries(
        new AbstractMap.SimpleEntry<>(".-", "a"),
        new AbstractMap.SimpleEntry<>("-...", "b"),
        new AbstractMap.SimpleEntry<>("-.-.", "c"),
        new AbstractMap.SimpleEntry<>("-..", "d"),
        new AbstractMap.SimpleEntry<>(".", "e"),
        new AbstractMap.SimpleEntry<>("..-.", "f"),
        new AbstractMap.SimpleEntry<>("--.", "g"),
        new AbstractMap.SimpleEntry<>("....", "h"),
        new AbstractMap.SimpleEntry<>("..", "i"),
        new AbstractMap.SimpleEntry<>(".---", "j"),
        new AbstractMap.SimpleEntry<>("-.-", "k"),
        new AbstractMap.SimpleEntry<>(".-..", "l"),
        new AbstractMap.SimpleEntry<>("--", "m"),
        new AbstractMap.SimpleEntry<>("-.", "n"),
        new AbstractMap.SimpleEntry<>("---", "o"),
        new AbstractMap.SimpleEntry<>(".--.", "p"),
        new AbstractMap.SimpleEntry<>("--.-", "q"),
        new AbstractMap.SimpleEntry<>(".-.", "r"),
        new AbstractMap.SimpleEntry<>("...", "s"),
        new AbstractMap.SimpleEntry<>("-", "t"),
        new AbstractMap.SimpleEntry<>("..-", "u"),
        new AbstractMap.SimpleEntry<>("...-", "v"),
        new AbstractMap.SimpleEntry<>(".--", "w"),
        new AbstractMap.SimpleEntry<>("-..-", "x"),
        new AbstractMap.SimpleEntry<>("-.--", "y"),
        new AbstractMap.SimpleEntry<>("--..", "z")
    );

    private String getLetter(String morseCharacter) {
        return this.dicionario.get(morseCharacter);
    }

    private String parseWord(String morseWord) {
        String[] morseCharacters = morseWord.split(" ");
        StringBuilder decriptedWord = new StringBuilder();
        for (String morseCharacter : morseCharacters) {
            decriptedWord.append(this.getLetter(morseCharacter));
        }
        return decriptedWord.toString();
    }

    public String parse(String morseCode) {
        String[] morseWords = morseCode.split("   ");
        StringBuilder decriptedMessage = new StringBuilder();
        for (String morseWord : morseWords) {
            decriptedMessage.append(this.parseWord(morseWord)).append(" ");
        }
        return decriptedMessage.toString();
    }
}
