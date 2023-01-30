package shs.sheilaJava.polum.book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    public final BookRepository bookRepository;

    public List<Book> getAllBooksByLibrary(Integer libraryId) {
        return bookRepository.findByLibraryId(libraryId);
    }

    public List<Book> getAllBooksByUser(Integer userId) {
        return bookRepository.findByUserId(userId);
    }

    public void createBook(Book book) {
        bookRepository.save(book);
    }

    public void updateBook(Book book, Integer id) {
        if (bookRepository.findById(id).isPresent()) {
            throw new RuntimeException("Book not found");
        }
        Book originalBook = bookRepository.findById(id).get();
        if (book.getTitle() != null && book.getTitle().length() <= 255) originalBook.setTitle(book.getTitle());
        if (book.getAuthor() != null && book.getAuthor().length() <= 150) originalBook.setAuthor(book.getAuthor());
        if (book.getGenre() != null && book.getGenre().length() <= 50) originalBook.setGenre(book.getGenre());
        if (book.getPages() != null && book.getPages() <= 9999) originalBook.setPages(book.getPages());
        if (book.getDaysToRead() != null && book.getDaysToRead() <= 999)
            originalBook.setDaysToRead(book.getDaysToRead());
        bookRepository.save(originalBook);
    }

    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
}
