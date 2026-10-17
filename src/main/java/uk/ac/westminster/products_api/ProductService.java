//TUT3 Activity:1 Task:2 - Create class, name, add @Service & import it
package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    //TUT3 Activity:1 Task:3 - add 2 fields
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    //TUT3 Activity:1 Task:4 - write getAllProducts and addProduct
    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    //TUT3 Activity:3 Task:8 - Add getProductById
    public Optional<Product> getProductById(Long id) {
        return products.stream()
                       .filter(p -> p.getId().equals(id))
                       .findFirst();
    }

    //TUT3 Activity:4 Task:13
    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    //TUT3 Activity:5 Task:16 - add findByName
    public List<Product> findByName(String name) {
        return products.stream()
                       .filter(p -> p.getName().contains(name))
                       .toList();
    }
}
