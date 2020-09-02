package spring.docs.ex.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class BookCreateResponse {
    private final String title;

    private final String author;

    private final Integer price;
}
