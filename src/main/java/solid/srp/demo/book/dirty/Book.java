package solid.srp.demo.book.dirty;

public class Book {
    private String name;
    private String author;
    private String text;

    public String replaceWordInText(String word, String replacementWord) {
        return text.replaceAll(word, replacementWord);
    }

    public boolean isWordInText(String word) {
        return text.contains(word);
    }

    void printTextToConsole() {
    }
}