package quotes.resubmit;

public class Quotes {

    private String author;
    private String likes;
    private String text;

    public Quotes(String author, String likes, String text) {
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public String getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "author='" + author + '\'' +
                ", likes='" + likes + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
