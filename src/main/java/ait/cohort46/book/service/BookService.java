package ait.cohort46.book.service;

import ait.cohort46.book.dto.AuthorDto;
import ait.cohort46.book.dto.BookDto;

public interface BookService {
    Boolean addBook(BookDto bookDto);
    BookDto findBookByIsbn(String isbn);
    BookDto removeBook(String isbn);
    BookDto updateBookTitle(String isbn, String title);

    Iterable<BookDto> findBooksByAuthor(String authorName);
    Iterable<BookDto> findBooksByPublisher(String publisherName);
    Iterable<AuthorDto> findBookAuthors(String isbn);
    Iterable<String> findPublishersByAuthor(String authorName);

    AuthorDto removeAuthor(String authorName);
}
