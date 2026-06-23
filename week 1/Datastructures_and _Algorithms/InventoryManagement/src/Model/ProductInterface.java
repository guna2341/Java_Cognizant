package Model;

public interface ProductInterface {

    public ProductInterface setProductName(String name);

    public ProductInterface setQuantity(int quantity);

    public ProductInterface setPrice(double price);

    public String getId();

    public String getProductName();

    public int getQuantity();

    public double getPrice();
}
