package com.harsh.shopmall.controller;

import com.harsh.shopmall.model.Staff;
import com.harsh.shopmall.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    StaffService staffService;

    @GetMapping("/list")
    public ResponseEntity<List<Staff>> getAllEmployees(){
        return ResponseEntity.ok(staffService.getAllEmployees());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Staff> getEmployee(@PathVariable int id){
        return ResponseEntity.ok(staffService.getEmployeeById(id));
    }

    @PostMapping("/add")
    public void addEmployee(@RequestBody Staff staff){
        staffService.addEmployee(staff);
    }

    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody Staff staff,@PathVariable int id){
        staffService.updateEmployee(staff,id);
    }

    @DeleteMapping("/delete-list")
    public void deleteAllEmployees(){
        staffService.deleteAllEmployees();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(@PathVariable int id){
        staffService.deleteEmployeeById(id);
    }
}
