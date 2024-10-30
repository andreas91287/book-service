package ait.cohort46.book.dto;

import lombok.Getter;

import java.util.Set;

@Getter
public class BookDto {
    private String isbn;
    private String title;
    private Set<AuthorDto> authors;
    private String publisher;
}
