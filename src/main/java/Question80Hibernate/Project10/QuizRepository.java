package Question80Hibernate.Project10;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuizRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public QuizRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Quiz quiz) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(quiz);
    }

    public Quiz getById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Quiz.class, id);
    }

    public List<Quiz> getAllQuizzes() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Quiz", Quiz.class).getResultList();
    }

    // Other data access methods for quizzes
}
