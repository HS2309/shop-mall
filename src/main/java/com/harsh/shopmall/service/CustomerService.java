package com.harsh.shopmall.service;

import com.harsh.shopmall.model.Customer;
import com.harsh.shopmall.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        return (List<Customer>)customerRepository.findAll();
    }

    public Customer getCustomer(long phoneNumber){
        return customerRepository.findByPhoneNumber(phoneNumber);
    }

    public Customer addCustomer(Customer customer){
        customerRepository.save(customer);
        return customer;
    }

    public Customer updateCustomer(Customer customer,long phoneNumber){
        customer.setPhoneNumber(phoneNumber);
        customerRepository.save(customer);
        return customer;
    }

    public void deleteAllCustomers(){
        customerRepository.deleteAll();
    }

    public void deleteCustomerById(long phoneNumber){
        customerRepository.deleteByPhoneNumber(phoneNumber);
    }
}
