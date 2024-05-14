package org.acme.infra.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.domain.model.Product;
import org.acme.domain.repository.IProductRepository;

import java.util.List;

@ApplicationScoped
public class ProductRepositoryImpl implements IProductRepository, PanacheRepositoryBase<Product, Long> {

    @Override
    public List<Product> getAllProducts() {
        return listAll();
    }

    @Override
    public Product getProductById(Long id) {
        return findById(id);
    }

    @Override
    public void saveProduct(Product product) {
        persist(product);
    }

    @Override
    public void deleteProductById(Long id) {
        deleteById(id);
    }
}