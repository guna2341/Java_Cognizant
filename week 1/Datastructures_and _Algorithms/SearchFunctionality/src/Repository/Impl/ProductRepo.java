package Repository.Impl;

import Model.ProductInterface;
import Repository.ProductRepoInterface;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductRepo implements ProductRepoInterface {

    final private HashMap<String, ProductInterface> inventory;
    final private ArrayList<ProductInterface> list;
    final private ArrayList<ProductInterface> sortedList;

    public ProductRepo() {
        inventory = new HashMap<String, ProductInterface>();
        list = new ArrayList<ProductInterface>();
        sortedList = new ArrayList<ProductInterface>();
    }

    private int binarySearch(ArrayList<ProductInterface> list, String target) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = list.get(mid).getId().compareTo(target);
            if (cmp < 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return left;
    }

    @Override
    public void addProduct(ProductInterface product) {
        if (inventory.containsKey(product.getId())) {
            System.out.println("Product with id already exists.");
            return;
        }
        list.add(product);
        int index = binarySearch(sortedList, product.getId());
        sortedList.add(index, product);
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

    @Override
    public ArrayList<ProductInterface> getProductsByLinearSearch(String id, String name, String category) {
        ArrayList<ProductInterface> search = new ArrayList<ProductInterface>();
        for(ProductInterface product: list) {
            if (product.getId().equals(id) || product.getProductName().equals(name) || product.getCategory().equals(category)) {
                search.add(product);
            }
        }
        return search;
    }

    @Override
    public ProductInterface getProductIdByBinarySearch(String id) {
        int left = 0, right = sortedList.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            ProductInterface product = sortedList.get(mid);
            if (product.getId().equals(id)) {
                return sortedList.get(mid);
            }
            int cmp = product.getId().compareTo(id);
            if (cmp < 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return null;
    }

}
