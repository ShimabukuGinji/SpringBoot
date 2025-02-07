package com.example.lesson.service;

import com.example.lesson.entity.InsertProduct;
import com.example.lesson.entity.Product;
import com.example.lesson.repository.IProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService implements IProductService {

    private IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public int insert(InsertProduct product) {
        return productRepository.insert(product);
    }

    @Override
    public int update(Product product) {
        return productRepository.update(product);
    }

    @Override
    public int delete(int id) {
        return productRepository.delete(id);
    }
}
