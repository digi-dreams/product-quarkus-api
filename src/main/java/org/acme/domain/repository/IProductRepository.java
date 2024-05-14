package org.acme.domain.repository;

import org.acme.domain.model.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> getAllProducts();

    Product getProductById(Long id);

    void saveProduct(Product product);

    void deleteProductById(Long id);
}
