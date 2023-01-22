package shs.sheilaJava.polum.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "author", nullable = false)
    private String author;
    @Column(name = "genre", nullable = false)
    private String genre;
    @Column(name = "pages", nullable = false, length = 4)
    private Integer pages;
    @Column(name = "days_to_read", nullable = false, length = 3)
    private Integer daysToRead;
    @ManyToOne
    @JoinColumn(name = "library_id", nullable = false)
    private Library library;

    public Book() {
    }

    public Book(Integer id, String title, String author, String genre, Integer pages, Integer daysToRead, Library library) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
