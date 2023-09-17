package Question71Hibernate.Project1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public BookRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(book);
    }

    public Book getById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Book.class, id);
    }

    public List<Book> getAllBooks() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Book", Book.class).getResultList();
    }

    // Other data access methods for books
}
