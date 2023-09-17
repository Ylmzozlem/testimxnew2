package Question73Hibernate.Project3;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @Column(name = "completed")
    private boolean completed;

    @ManyToOne
    @JoinColumn(name = "user_ıd")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Constructors, getters, setters, and other methods

    public Task() {
        // Default constructor
    }

    // Constructors with fields

    public Task(String title, String description, LocalDate dueDate, boolean completed, User user) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = completed;
        this.user = user;
    }

    // Getter and Setter methods

    // Other methods
}
