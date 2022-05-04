package com.harsh.shopmall.controller;

import com.harsh.shopmall.model.Vender;
import com.harsh.shopmall.service.VenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vender")
public class VenderController {

    @Autowired
    VenderService venderService;

    @GetMapping("/list")
    public ResponseEntity<List<Vender>> getAllVenders(){
        return ResponseEntity.ok(venderService.getAllVenders());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vender> getVenderById(@PathVariable int id){
        return ResponseEntity.ok(venderService.getVenderById(id));
    }
    @PostMapping("/add")
    public void addVender(@RequestBody Vender vender){
        venderService.addVender(vender);
    }

    @PutMapping("/update/{id}")
    public void updateVender(@RequestBody Vender vender,@PathVariable int id){
        venderService.updateVender(vender,id);
    }

    @DeleteMapping("/delete-list")
    public void deleteAllVenders(){
        venderService.deleteAllVenders();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id){
        venderService.deleteVenderById(id);
    }
}
