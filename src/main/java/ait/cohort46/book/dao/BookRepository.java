package ait.cohort46.book.dao;

import ait.cohort46.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.stream.Stream;

public interface BookRepository extends JpaRepository<Book, String> {
    Stream<Book> findBooksByAuthorsNameIgnoreCase(String authorName);

    Stream<Book> findBooksByPublisherPublisherName(String authorName);

    void deleteBooksByAuthorsNameIgnoreCase(String authorName);
}
