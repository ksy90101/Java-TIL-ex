package test.jacoco.ex;

public class Book {
    private String title;

    private Member author;

    public Book(String title, Member author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Member getAuthor() {
        return author;
    }
}
