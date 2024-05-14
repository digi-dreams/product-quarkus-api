package org.acme.presentation.contract;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.domain.model.Product;

import java.util.List;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface IProductController {

    @GET
    List<Product> getAllProducts();

    @GET
    @Path("/{id}")
    Product getProductById(@PathParam("id") Long id);

    @POST
    void saveProduct(Product product);

    @DELETE
    @Path("/{id}")
    void deleteProductById(@PathParam("id") Long id);
}
