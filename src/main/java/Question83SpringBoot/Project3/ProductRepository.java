package Question83SpringBoot.Project3;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository {
    public default List<Product> findAll() {
        return findAll();
    }
}
