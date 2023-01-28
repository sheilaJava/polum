package shs.sheilaJava.polum.book;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    public final BookService bookService;
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
    @PutMapping
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }
    @DeleteMapping
    public void deleteBook(@RequestBody Integer id) {
        bookService.deleteBook(id);
    }
}
