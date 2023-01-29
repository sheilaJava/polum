package shs.sheilaJava.polum.library;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LibraryService {
    public final LibraryRepository libraryRepository;
    public List<Library> getAllLibrariesByUser(Integer userId) {
        return libraryRepository.findByUserId(userId);
    }
    public void createLibrary(Library library) {
        libraryRepository.save(library);
    }
    public void updateLibrary(Library library, Integer id) {
        if (libraryRepository.findById(id).isPresent()) {
            Library originalLibrary = libraryRepository.findById(id).get();
            if (library.getName() != null && library.getName().length() <= 50) originalLibrary.setName(library.getName());
            libraryRepository.save(originalLibrary);
        } else {
            throw new RuntimeException("Library not found");
        }
    }
    public void deleteLibrary(Integer id) {
        libraryRepository.deleteById(id);
    }
}
