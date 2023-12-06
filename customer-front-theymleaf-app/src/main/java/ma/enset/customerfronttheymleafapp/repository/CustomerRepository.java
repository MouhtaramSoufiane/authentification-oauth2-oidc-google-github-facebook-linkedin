package ma.enset.customerfronttheymleafapp.repository;

import ma.enset.customerfronttheymleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
