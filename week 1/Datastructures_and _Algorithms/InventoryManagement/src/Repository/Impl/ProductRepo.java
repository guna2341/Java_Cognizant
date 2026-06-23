package Repository.Impl;

import Model.ProductInterface;
import Repository.ProductRepoInterface;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductRepo implements ProductRepoInterface {

    final private HashMap<String, ProductInterface> inventory;

    public ProductRepo() {
        inventory = new HashMap<String, ProductInterface>();
    }

    @Override
    public void addProduct(ProductInterface product) {
        if (inventory.containsKey(product.getId())) {
            System.out.println("Product with id already exists.");
            return;
        }
        inventory.put(product.getId(), product);
    }

    @Override
    public void removeProduct(String id) {
        if (!inventory.containsKey(id)) {
            System.out.println("Product with id: " + id + " does not exist.");
            return;
        }
        inventory.remove(id);
    }

    @Override
    public ArrayList<ProductInterface> getProducts() {

        return new ArrayList<>(inventory.values());
    }

    @Override
    public ProductInterface getProductById(String id) {
        if (!inventory.containsKey(id)) {
            return null;
        }
        return inventory.get(id);
    }
}
