package Question77Hibernate.Project7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReservationRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public ReservationRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Reservation reservation) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(reservation);
    }

    public Reservation getById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Reservation.class, id);
    }

    public List<Reservation> getAllReservations() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Reservation", Reservation.class).getResultList();
    }

    // Other data access methods for reservations
}
