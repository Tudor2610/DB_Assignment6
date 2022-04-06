package com.dbspring.db_assignment6.repository;

import com.dbspring.db_assignment6.dao.OrderDAO;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderDAO, Integer> {
}
