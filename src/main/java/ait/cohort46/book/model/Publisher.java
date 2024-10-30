package ait.cohort46.book.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "publisherName")
@Entity
@Table(name = "publisher")
public class Publisher implements Serializable {
    @Id
    @Column(name = "publisher_name")
    private String publisherName;
    @OneToMany(mappedBy = "publisher")
    private Set<Book> books;

    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return publisherName;
    }
}
