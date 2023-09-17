package Question73Hibernate.Project3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public TaskRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Task task) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(task);
    }

    public Task getById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Task.class, id);
    }

    public List<Task> getAllTasks() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Task", Task.class).getResultList();
    }

    // Other data access methods for tasks
}
