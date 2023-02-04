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
        if (library.getName() == null) {
            throw new RuntimeException("Name is required");
        } else if (library.getName().length() >= 50) {
            throw new RuntimeException("Name must be less than 50 characters");
        }

        libraryRepository.save(library);
    }

    public void updateLibrary(Library library, Integer id) {
        if (libraryRepository.findById(id).isEmpty()) {
            throw new RuntimeException("Library not found");
        }
        Library originalLibrary = libraryRepository.findById(id).get();

        if (library.getName() != null && library.getName().length() >= 50) {
            throw new RuntimeException("Name must be less than 50 characters");
        } else if (library.getName() != null)
            originalLibrary.setName(library.getName());

        libraryRepository.save(originalLibrary);
    }

    public void deleteLibrary(Integer id) {
        libraryRepository.deleteById(id);
    }
}
