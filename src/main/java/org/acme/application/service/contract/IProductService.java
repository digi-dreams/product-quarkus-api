package org.acme.application.service.contract;

import org.acme.domain.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> getAllProducts();

    Product getProductById(Long id);

    void saveProduct(Product product);

    void deleteProductById(Long id);
}
