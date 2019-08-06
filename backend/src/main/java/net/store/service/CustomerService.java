package net.store.service;

import net.store.domain.Customer;

public interface CustomerService {

    Customer findCustomerByUsername(String username);
}
