package ait.cohort46.book.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "isbn")
@Entity
public class Book implements Serializable {
    @Id
    private String isbn;
    private String title;
    @ManyToMany
    private Set<Author> authors;
    @ManyToOne
    private Publisher publisher;
}
