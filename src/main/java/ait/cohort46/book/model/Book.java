package ait.cohort46.book.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "isbn")
@Entity
@Table(name = "book")
public class Book implements Serializable {
    @Id
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "title")
    private String title;
    @ManyToMany
    @JoinTable(
            name = "book_authors",
            joinColumns = @JoinColumn(name = "book_isbn"),
            inverseJoinColumns = @JoinColumn(name = "authors_name")
    )
    private Set<Author> authors;
    @ManyToOne
    @JoinColumn(name = "publisher_publisher_name")
    private Publisher publisher;
}
