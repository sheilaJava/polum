package shs.sheilaJava.polum.library;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LibraryService {
    public final LibraryRepository libraryRepository;
    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }
    public Library createLibrary(Library library) {
        return libraryRepository.save(library);
    }
    public Library updateLibrary(Library library) {
        return libraryRepository.save(library);
    }
    public void deleteLibrary(Integer id) {
        libraryRepository.deleteById(id);
    }
}
