package org.acme.application.service;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import org.acme.application.service.contract.IProductService;
import org.acme.domain.model.Product;
import org.acme.domain.repository.IProductRepository;

import java.util.List;

@ApplicationScoped
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {

    private final IProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.getProductById(id);
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.saveProduct(product);
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteProductById(id);
    }
}
