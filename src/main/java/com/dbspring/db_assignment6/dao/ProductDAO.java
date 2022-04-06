package com.dbspring.db_assignment6.dao;

import com.dbspring.db_assignment6.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class ProductDAO implements DAO<ProductDAO> {
    private final ProductRepository productRepository;

    @Override
    public Optional<ProductDAO> get(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public void create(ProductDAO product) {
        productRepository.save(product);
    }

    @Override
    public void delete(ProductDAO product) {
        productRepository.delete(product);
    }

    @Override
    public void update(ProductDAO product) {
        productRepository.save(product);
    }
}
