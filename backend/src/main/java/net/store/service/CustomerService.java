package net.store.service;

import net.store.domain.Customer;

import java.util.List;

public interface CustomerService {

    void saveCustomer(Customer customer);

    void deleteCustomerById(long id);

    List<Customer> findAll();

    Customer findCustomerByUsername(String username);

    Customer findCustomerById(long id);

    Customer findCustomerByEmail(String email);

    List<Customer> findCustomerByFirstName(String firstName);

    List<Customer> findCustomerBySecondName(String secondName);

}
