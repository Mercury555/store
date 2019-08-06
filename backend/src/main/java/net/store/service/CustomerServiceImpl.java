package net.store.service;

import net.store.domain.Customer;
import net.store.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository repository;

    @Override
    public void saveCustomer(Customer customer) {
        repository.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteCustomerById(long id) {
        repository.delete(repository.findById(id).get());
    }

    @Override
    public Customer findCustomerByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public Customer findCustomerByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Customer findCustomerById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Customer> findCustomerByFirstName(String firstName) {
        return repository.findByFirstName(firstName);
    }

    @Override
    public List<Customer> findCustomerBySecondName(String secondName) {
        return repository.findBySecondName(secondName);
    }
}
