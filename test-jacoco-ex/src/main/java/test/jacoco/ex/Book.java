package test.jacoco.ex;

public class Book {
    private String title;

    private Member author;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Member getAuthor() {
        return author;
    }
}
