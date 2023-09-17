package Question74Hibernate.Project4;

import Question73Hibernate.Project3.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Question79Hibernate.Project9.User user;

    public Question79Hibernate.Project9.User getUser() {
        return user;
    }

    public void setUser(Question79Hibernate.Project9.User user) {
        this.user = user;
    }

    // Constructors, getters, setters, and other methods

    public Post() {
        // Default constructor
    }

    // Constructors with fields

    public Post(String title, String content, Date createdAt, User author) {
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.author = author;
    }

    // Getter and Setter methods

    // Other methods
}
