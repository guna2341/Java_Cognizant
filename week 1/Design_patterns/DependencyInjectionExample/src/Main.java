import Customer.CustomerRepository;
import Customer.Impl.CustomerRepositoryImpl;
import Service.Impl.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);
        System.out.println(customerService.addCustomer("1", "Guna"));
        System.out.println(customerService.addCustomer("2", "Arjun"));
        System.out.println(customerService.addCustomer("3", "Mohan"));
        System.out.println(customerService.findCustomerById("1"));
        System.out.println(customerService.setCustomer("3", "Bharath"));
        System.out.println(customerService.removeCustomer("3"));
    }
}