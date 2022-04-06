package com.dbspring.db_assignment6.repository;

import com.dbspring.db_assignment6.dao.ProductDAO;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductDAO, Integer> {
}
