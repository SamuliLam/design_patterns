package prototype;

public class Book implements Prototype{
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public Book(Book book) {
        this.title = book.title;
        this.author = book.author;
        this.genre = book.genre;
    }

    @Override
    public Book clone() {
        return new Book(this);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.genre = content;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return genre;
    }
}
