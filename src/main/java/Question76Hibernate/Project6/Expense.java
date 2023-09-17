package Question76Hibernate.Project6;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "amount")
    private double amount;

    @Column(name = "expense_date")
    @Temporal(TemporalType.DATE)
    private Date expenseDate;

    // Constructors, getters, setters, and other methods

    public Expense() {
        // Default constructor
    }

    // Constructors with fields

    public Expense(String description, double amount, Date expenseDate) {
        this.description = description;
        this.amount = amount;
        this.expenseDate = expenseDate;
    }

    // Getter and Setter methods

    // Other methods
}
