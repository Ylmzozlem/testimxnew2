package Question71Hibernate.Project1;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "available")
    private boolean available;

    // Constructors, getters, setters, and other methods

    public Book() {
        // Default constructor
    }

    // Constructors with fields

    public Book(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    // Getter and Setter methods

    // Other methods
}
