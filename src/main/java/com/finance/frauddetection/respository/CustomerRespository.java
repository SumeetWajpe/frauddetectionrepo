package com.finance.frauddetection.respository;

import com.finance.frauddetection.models.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRespository {
    private List<Customer> customers = new ArrayList<>();
    public CustomerRespository() {
        customers.add(new Customer(1, "Rahul Sharma", "ACC1001", "India"));
        customers.add(new Customer(2, "Priya Verma", "ACC1002", "India"));
        customers.add(new Customer(3, "John Smith", "ACC1003", "USA"));
    }
    public List<Customer> getCustomers() {
        return customers;
    }
    public Customer getCustomerById(int id) {
        return customers.stream().filter(customer -> customer.getId() == id)
                .findFirst().orElse(null);
    }
}
