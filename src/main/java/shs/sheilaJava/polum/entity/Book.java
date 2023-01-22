package shs.sheilaJava.polum.entity;

public class Book {
    private Long id;
    private String title;
    private String author;
    private String genre;
    private Integer pages;
    private Integer daysToRead;
    private Library library;

    public Book() {
    }

    public Book(Long id, String title, String author, String genre, Integer pages, Integer daysToRead, Library library) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.daysToRead = daysToRead;
        this.library = library;
    }

    public Book(String title, String author, String genre, Integer pages, Integer daysToRead, Library library) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.daysToRead = daysToRead;
        this.library = library;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getDaysToRead() {
        return daysToRead;
    }

    public void setDaysToRead(Integer daysToRead) {
        this.daysToRead = daysToRead;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                ", daysToRead=" + daysToRead +
                ", library=" + library +
                '}';
    }
}
