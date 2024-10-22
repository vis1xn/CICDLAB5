package ie.atu.week6lab5;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> myList  = new ArrayList<>();

    public List<Product> addProduct(Product product){
        myList.add(product);
        return myList;

    }
    public List<Product> updateProduct( int id, Product product) {
        for (Product p : myList) {
            if (product.getId() == id) {
                myList.remove(p);
            }
        }
        myList.add(product);
        return myList;
    }
    public List<Product> deleteProduct( int id, Product product) {
        for (Product p : myList) {
            if (product.getId() == id) {
                myList.remove(p);
            }
        }
        return myList;
    }

}
