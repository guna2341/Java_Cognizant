package Service.Impl;

import Customer.CustomerRepository;

public class CustomerService implements CustomerRepository {

    final private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public String findCustomerById(String id) {
        return customerRepository.findCustomerById(id);
    }

    @Override
    public String addCustomer(String id, String name) {
        return customerRepository.addCustomer(id, name);
    }

    @Override
    public String setCustomer(String id, String name) {
        return customerRepository.setCustomer(id, name);
    }

    @Override
    public String removeCustomer(String id) {
        return customerRepository.removeCustomer(id);
    }
}
