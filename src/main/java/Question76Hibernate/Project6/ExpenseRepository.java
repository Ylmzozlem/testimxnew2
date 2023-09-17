package Question76Hibernate.Project6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ExpenseRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public ExpenseRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Expense expense) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(expense);
    }

    public Expense getById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Expense.class, id);
    }

    public List<Expense> getAllExpenses() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Expense", Expense.class).getResultList();
    }

    // Other data access methods for expenses
}
