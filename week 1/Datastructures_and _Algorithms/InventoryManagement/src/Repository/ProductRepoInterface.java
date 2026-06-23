package Repository;

import Model.ProductInterface;

import java.util.ArrayList;
import java.util.HashMap;

public interface ProductRepoInterface {

    void addProduct(ProductInterface product);

    public void removeProduct(String id);

    public ArrayList<ProductInterface> getProducts();

    public ProductInterface getProductById(String id);

}
