package Question83SpringBoot.Project3;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime orderDate;
    @ManyToOne
    private User customer;
    @OneToMany(mappedBy = "order")
    private List<OrderItem> items;
    // Add other order details and relationships as needed

    // Constructors, getters, setters
}
