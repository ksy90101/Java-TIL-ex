package spring.docs.ex.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BookCreateRequest {
    private final String title;

    private final String author;

    private final Integer price;
}
