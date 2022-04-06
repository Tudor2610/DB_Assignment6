package com.dbspring.db_assignment6.repository;

import com.dbspring.db_assignment6.dao.CustomerDAO;
import com.dbspring.db_assignment6.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerDAO, Integer> {
    Iterable<Customer> getAllByUsername(String username);
    Iterable<Customer> getAllByCity(String city);
    Iterable<Customer> getAllByCountry(String country);
}
