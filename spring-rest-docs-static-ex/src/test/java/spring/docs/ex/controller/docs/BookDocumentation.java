package spring.docs.ex.controller.docs;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.*;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;

import org.springframework.restdocs.mockmvc.RestDocumentationResultHandler;

public class BookDocumentation {
    public static RestDocumentationResultHandler createBook() {
        return document("books/create",
                requestFields(
                        fieldWithPath("title").description("책 제목"),
                        fieldWithPath("author").description("책 저자"),
                        fieldWithPath("price").description("책 가")
                ),
                responseFields(
                        fieldWithPath("title").description("책 제목"),
                        fieldWithPath("author").description("책 저자"),
                        fieldWithPath("price").description("책 가")
                )
        );
    }
}
