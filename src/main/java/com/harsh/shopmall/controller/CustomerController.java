package com.harsh.shopmall.controller;

import com.harsh.shopmall.model.Customer;
import com.harsh.shopmall.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/list")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable(name = "id") long phoneNumber){
        return ResponseEntity.ok(customerService.getCustomer(phoneNumber));
    }

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

    @PutMapping("/update/{id}")
    public void updateCustomer(@RequestBody Customer customer,@PathVariable(name = "id") long phoneNumber){
        customerService.updateCustomer(customer,phoneNumber);
    }

    @DeleteMapping("/delete-list")
    public void deleteAllCustomer(){
        customerService.deleteAllCustomers();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable(name = "id") long phoneNumber){
        customerService.deleteCustomerById(phoneNumber);
    }
}
