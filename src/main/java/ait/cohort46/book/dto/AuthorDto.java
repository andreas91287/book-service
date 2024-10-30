package ait.cohort46.book.dto;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class AuthorDto {
    private String name;
    private LocalDate birthDate;
}
