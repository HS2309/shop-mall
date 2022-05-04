package com.harsh.shopmall.repository;

import com.harsh.shopmall.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {
    @Transactional
    public  void deleteByPhoneNumber(long phoneNumber);
    public Customer findByPhoneNumber(long phoneNumber);
}
