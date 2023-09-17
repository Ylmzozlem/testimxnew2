package Question74Hibernate.Project4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public PostRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Post post) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(post);
    }

    public Post getById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Post.class, id);
    }

    public List<Post> getAllPosts() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Post", Post.class).getResultList();
    }

    // Other data access methods for posts
}
