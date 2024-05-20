package com.example.lesson.service;

import com.example.lesson.entity.InsertProduct;
import com.example.lesson.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findById(int id);

    int insert(InsertProduct product);

    int update(Product product);

    int delete(int id);
}
