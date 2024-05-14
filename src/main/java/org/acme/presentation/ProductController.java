package org.acme.presentation;

import lombok.RequiredArgsConstructor;
import org.acme.application.service.contract.IProductService;
import org.acme.domain.model.Product;
import org.acme.presentation.contract.IProductController;

import java.util.List;

@RequiredArgsConstructor
public class ProductController implements IProductController {

    private final IProductService service;

    @Override
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @Override
    public Product getProductById(Long id) {
        return service.getProductById(id);
    }

    @Override
    public void saveProduct(Product product) {
        service.saveProduct(product);
    }

    @Override
    public void deleteProductById(Long id) {
        service.deleteProductById(id);
    }
}
