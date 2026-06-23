package View;

import Model.ProductInterface;

import java.util.ArrayList;

public interface ProductViewInterface {

    public void displayProduct(ProductInterface product);

    public  void displayAllProducts(ArrayList<ProductInterface> products);

}
