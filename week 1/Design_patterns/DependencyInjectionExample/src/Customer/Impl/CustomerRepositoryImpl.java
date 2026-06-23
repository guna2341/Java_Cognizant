package Customer.Impl;

import Customer.CustomerRepository;

import java.util.HashMap;

public class CustomerRepositoryImpl implements CustomerRepository {

    HashMap<String, String> customers;

    public CustomerRepositoryImpl() {
        customers = new HashMap<String, String>();
    }

    public CustomerRepositoryImpl(String id, String name) {
        customers = new HashMap<String, String>();
        customers.put(id, name);
    }

    public String addCustomer(String id, String name) {
        if (customers.containsKey(id)) {
            return "Student with " + id + " already exists.";
        }
        customers.put(id, name);
        return "Customer with id: " + id + " and name: " + name + " added.";
    }

    public String setCustomer(String id, String name) {
        if (!customers.containsKey(id)) {
            return "Student with " + id + " does not exists.";
        }
        customers.put(id, name);
        return "Customer with id: " + id + " and name: " + name + " modified.";
    }

    public String removeCustomer(String id) {
        if (!customers.containsKey(id)) {
            return "Student with id: " + id + " does not exists.";
        }
        customers.remove(id);
        return "Customer with " + id + " removed.";
    }

    @Override
    public String findCustomerById(String id) {
        if (!customers.containsKey(id)) {
            return "Cannot find customer with id: " + id;
        }
        return "Found customer with id: " + id + " and name: " + customers.get(id);
    }
}
