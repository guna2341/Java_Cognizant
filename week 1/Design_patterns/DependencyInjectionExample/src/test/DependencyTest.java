package test;

import Customer.CustomerRepository;
import Customer.Impl.CustomerRepositoryImpl;
import Service.Impl.CustomerService;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DependencyTest {

    @Test
    public void dependencyTest() {

        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);
        assertEquals("Customer with id: 1 and name: Guna added.", customerService.addCustomer("1", "Guna"));
        assertEquals("Customer with id: 2 and name: Arjun added.", customerService.addCustomer("2", "Arjun"));
        assertEquals("Customer with id: 3 and name: Mohan added.", customerService.addCustomer("3", "Mohan"));
        assertEquals("Found customer with id: 1 and name: Guna", customerService.findCustomerById("1"));
        assertEquals("Customer with id: 3 and name: Bharath modified.", customerService.setCustomer("3", "Bharath"));
        assertEquals("Customer with 3 removed.", customerService.removeCustomer("3"));
    }
}