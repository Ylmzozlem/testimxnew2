package Question80Hibernate.Project10;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "quizzes")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<Question> questions = new ArrayList<>();

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    // Constructors, getters, setters, and other methods

    public Quiz() {
        // Default constructor
    }

    // Constructors with fields

    public Quiz(String title) {
        this.title = title;
    }

    // Getter and Setter methods

    // Other methods
}
