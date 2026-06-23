package Customer;

public interface CustomerRepository {

    public String findCustomerById(String id);

    public String addCustomer(String id, String name);

    public String setCustomer(String id, String name);

    public String removeCustomer(String id);

}
