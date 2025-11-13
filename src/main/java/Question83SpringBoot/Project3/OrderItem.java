package Question83SpringBoot.Project3;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Product product;
    private int quantity;
    private double price;
    @ManyToOne
    private Order order;
    // Add other order item details and relationships as needed

    // Constructors, getters, setters
}