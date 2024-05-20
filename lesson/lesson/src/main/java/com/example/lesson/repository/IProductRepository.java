package com.example.lesson.repository;

import com.example.lesson.entity.InsertProduct;
import com.example.lesson.entity.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    Product findById(int id);

    int insert(InsertProduct product);

    int update(Product product);

    int delete(int id);
}
