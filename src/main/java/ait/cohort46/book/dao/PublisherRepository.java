package ait.cohort46.book.dao;

import ait.cohort46.book.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PublisherRepository extends JpaRepository<Publisher, String> {
    @Query("select distinct p.publisherName from Book b join b.publisher p join b.authors a where a.name=?1")
    List<String> findPublishersByAuthor(String authorName);
    // Set<String> findPublishersByAuthor(String authorName);
}
