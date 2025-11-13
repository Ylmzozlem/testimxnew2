package Question83SpringBoot.Project3;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private boolean isAdmin;
    // Add other user details and relationships as needed

    // Constructors, getters, setters
}
