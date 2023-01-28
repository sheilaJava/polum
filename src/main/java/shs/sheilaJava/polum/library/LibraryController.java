package shs.sheilaJava.polum.library;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libraries")
@RequiredArgsConstructor
public class LibraryController {
    public final LibraryService libraryService;
    @GetMapping
    public List<Library> getAllLibraries() {
        return libraryService.getAllLibraries();
    }
    @PostMapping
    public Library createLibrary(@RequestBody Library library) {
        return libraryService.createLibrary(library);
    }
    @PutMapping
    public Library updateLibrary(@RequestBody Library library) {
        return libraryService.updateLibrary(library);
    }
    public void deleteLibrary(@RequestBody Integer id) {
        libraryService.deleteLibrary(id);
    }
}
