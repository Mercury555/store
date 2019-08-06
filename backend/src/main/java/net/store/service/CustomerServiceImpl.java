package net.store.service;

import net.store.domain.Customer;
import net.store.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository repository;

    @Override
    public Customer findCustomerByUsername(String username) {
        return repository.findByUsername(username);
    }
}
