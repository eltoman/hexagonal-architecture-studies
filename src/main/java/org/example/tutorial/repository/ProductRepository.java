package org.example.tutorial.repository;

import org.example.tutorial.domain.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getProducts();

    Product getProductById(Integer productId);

    Product addProduct(Product product);

    Product removeProduct(Integer productId);
}
