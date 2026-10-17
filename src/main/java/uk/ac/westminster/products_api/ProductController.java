package uk.ac.westminster.products_api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

////TUT3 Activity:2 Task:6  - empty the controller of state removed wk2
@RestController
public class ProductController {

    //TUT3 Activity:2 Task:5 - autowire service to the controller
    @Autowired
    private ProductService productService;

    //TUT3 Activity:2 Task:7 - add GET/products & run
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    //TUT3 Activity:3 Task:9 Add GET/products/{id} endpoint
    @GetMapping("products/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id).orElse(null);
    }

    //TUT3 Activity:3 Task:10 Add POST/products endpoint
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    //TUT3 Activity:4 Task:14
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    //TUT3 Activity:5 Task:17 - Add search endpoint
    @GetMapping("/products/search")
    public List<Product> search(@RequestParam String name) {
        return productService.findByName(name);
    }
}