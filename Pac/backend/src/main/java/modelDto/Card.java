package modelDto;

public class Card {

    private Long id;
    private String[] letters;

    public Card(Long id, String[] letters) {
        this.id = id;
        this.letters = letters;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String[] getLetters() {
        return letters;
    }

    public void setLetters(String[] letters) {
        this.letters = letters;
    }
}
