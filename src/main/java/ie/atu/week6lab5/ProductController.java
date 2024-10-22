package ie.atu.week6lab5;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService myService;

    public ProductController(ProductService myService) {

        this.myService = myService;
    }

    private List<Product> list = new ArrayList<>();
    //Creating a class which is interested in requests and responses. Separation of Concern
    @PostMapping("/create")
    public List<Product> newProduct(@Valid @RequestBody Product product){
        list = myService.addProduct(product);
        return list;
    }
    @PutMapping("/update/{id}")
    public List<Product> updateProduct(@Valid @PathVariable int id, @RequestBody Product product){
        list = myService.updateProduct(id, product);
        return list;
    }

    @DeleteMapping("/delete/{id}")
    public List<Product> deleteProduct(@Valid @PathVariable int id){

        list = myService.deleteProduct(id);
        return list;
    }

}
