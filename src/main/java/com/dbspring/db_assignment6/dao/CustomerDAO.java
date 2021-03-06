package com.dbspring.db_assignment6.dao;


import com.dbspring.db_assignment6.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class CustomerDAO implements DAO<CustomerDAO> {
    private final CustomerRepository customerRepository;

    @Override
    public Optional<CustomerDAO> get(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    public void create(CustomerDAO customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(CustomerDAO customer) {
        customerRepository.delete(customer);
    }

    @Override
    public void update(CustomerDAO customer) {
        customerRepository.save(customer);
    }
}
