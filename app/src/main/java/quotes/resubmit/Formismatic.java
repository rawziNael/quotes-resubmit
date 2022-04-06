package quotes.resubmit;

public class Formismatic {

    private String quoteText;
    private String quoteAuthor;
    private String quoteLink;

    public Formismatic(String text, String author, String link) {
        this.quoteText = text;
        this.quoteAuthor = author;
        this.quoteLink = link;
    }

    @Override
    public String toString() {
        return "Formismatic{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                ", quoteLink='" + quoteLink + '\'' +
                '}';
    }
}
