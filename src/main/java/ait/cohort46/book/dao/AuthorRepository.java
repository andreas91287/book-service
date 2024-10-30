package ait.cohort46.book.dao;

import ait.cohort46.book.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, String> {
}
