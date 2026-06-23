package Services;

import Model.ProductInterface;

import java.util.ArrayList;
import java.util.HashMap;

public interface ProductServiceInterface {

    public void addProduct(String productId, String productName, int quantity, double price, String category);

    public void removeProduct(String id);

    public ArrayList<ProductInterface> getProducts();

    public ProductInterface getProductById(String id);

    public ArrayList<ProductInterface> getProductsByLinearSearch(String id, String name, String category);

    public ProductInterface getProductIdByBinarySearch(String id);

}
