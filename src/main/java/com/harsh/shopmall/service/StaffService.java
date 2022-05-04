package com.harsh.shopmall.service;

import com.harsh.shopmall.model.Staff;
import com.harsh.shopmall.model.Vender;
import com.harsh.shopmall.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    @Autowired
    StaffRepository staffRepository;

    public List<Staff> getAllEmployees(){
        return (List<Staff>) staffRepository.findAll();
    }

    public Staff getEmployeeById(int id){
        return staffRepository.findById(id).get();
    }

    public Staff addEmployee(Staff staff){
        return staffRepository.save(staff);
    }

    public Staff updateEmployee(Staff staff,int id){
        staff.setId(id);
        return staffRepository.save(staff);
    }

    public void deleteAllEmployees(){
        staffRepository.deleteAll();
    }

    public void deleteEmployeeById(int id){
        staffRepository.deleteById(id);
    }
}
