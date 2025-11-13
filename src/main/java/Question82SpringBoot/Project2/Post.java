package Question82SpringBoot.Project2;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    @ManyToOne
    private User author;
    // Add other post details and relationships as needed

    // Constructors, getters, setters
}
