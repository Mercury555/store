package net.store.repository;

import net.store.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByUsername(String username);

    Customer findByEmail(String email);

    List<Customer> findByFirstName(String firstName);

    List<Customer> findBySecondName(String secondName);

 }
