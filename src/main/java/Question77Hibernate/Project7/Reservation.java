package Question77Hibernate.Project7;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "guest_ıd")
    private Guest guest;

    @Column(name = "check_in_date")
    @Temporal(TemporalType.DATE)
    private Date checkInDate;

    @Column(name = "check_out_date")
    @Temporal(TemporalType.DATE)
    private Date checkOutDate;

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    // Constructors, getters, setters, and other methods

    public Reservation() {
        // Default constructor
    }

    // Constructors with fields

    public Reservation(Room room, Guest guest, Date checkInDate, Date checkOutDate) {
        this.room = room;
        this.guest = guest;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // Getter and Setter methods

    // Other methods
}
