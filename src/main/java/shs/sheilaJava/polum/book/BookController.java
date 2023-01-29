package shs.sheilaJava.polum.book;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    public final BookService bookService;
    @GetMapping("/{libraryId}")
    public List<Book> getAllBooksByLibrary(@PathVariable("libraryId") Integer libraryId) {
        return bookService.getAllBooksByLibrary(libraryId);
    }
    @GetMapping("/{userId}")
    public List<Book> getAllBooksByUser(@PathVariable("userId") Integer userId) {
        return bookService.getAllBooksByUser(userId);
    }
    @PostMapping
    public void createBook(@RequestBody Book book) {
        bookService.createBook(book);
    }
    @PutMapping("/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable("id") Integer id) {
        bookService.updateBook(book, id);
    }
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") Integer id) {
        bookService.deleteBook(id);
    }
}
