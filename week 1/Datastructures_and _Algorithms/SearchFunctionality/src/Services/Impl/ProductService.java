package Services.Impl;

import Model.Impl.Product;
import Model.ProductInterface;
import Repository.Impl.ProductRepo;
import Repository.ProductRepoInterface;
import Services.ProductServiceInterface;

import java.util.ArrayList;

public class ProductService implements ProductServiceInterface {

    ProductRepoInterface productRepo;
    public ProductService(ProductRepoInterface productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public void addProduct(String productId, String productName, int quantity, double price, String category) {
        ProductInterface product = new Product(productId, productName, quantity, price, category);
        productRepo.addProduct(product);
    }

    @Override
    public void removeProduct(String id) {
        productRepo.removeProduct(id);
    }

    @Override
    public ArrayList<ProductInterface> getProducts() {
        return productRepo.getProducts();
    }

    @Override
    public ProductInterface getProductById(String id) {
        return productRepo.getProductById(id);
    }

    @Override
    public ArrayList<ProductInterface> getProductsByLinearSearch(String id, String name, String category) {
        return productRepo.getProductsByLinearSearch(id, name, category);
    }

    @Override
    public ProductInterface getProductIdByBinarySearch(String id) {
        return productRepo.getProductIdByBinarySearch(id);
    }
}
