package spring.docs.ex.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import spring.docs.ex.dto.BookCreateRequest;
import spring.docs.ex.dto.BookCreateResponse;

@RestController
public class BookController {

    @PostMapping("/books")
    public static ResponseEntity<BookCreateResponse> createBook(
            @RequestBody final BookCreateRequest bookCreateRequest) {
        final BookCreateResponse bookCreateResponse = new BookCreateResponse(
                bookCreateRequest.getTitle(),
                bookCreateRequest.getAuthor(),
                bookCreateRequest.getPrice()
        );
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(bookCreateResponse);
    }
}
