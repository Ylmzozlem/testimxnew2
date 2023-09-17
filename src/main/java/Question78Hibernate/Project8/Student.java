package Question78Hibernate.Project8;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Column(name = "email")
    private String email;

    // Constructors, getters, setters, and other methods

    public Student() {
        // Default constructor
    }

    // Constructors with fields

    public Student(String firstName, String lastName, Date dateOfBirth, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    // Getter and Setter methods

    // Other methods
}
