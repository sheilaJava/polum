package shs.sheilaJava.polum.book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    public final BookRepository bookRepository;
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }
    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
}
