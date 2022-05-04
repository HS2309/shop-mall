package com.harsh.shopmall.controller;

import com.harsh.shopmall.model.Items;
import com.harsh.shopmall.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsController{

    @Autowired
    ItemsService itemsService;

    @GetMapping("/list")
    public ResponseEntity<List<Items>> getAllItems(){
        return ResponseEntity.ok(itemsService.getAllItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Items> getItemById(@PathVariable int id){
        return ResponseEntity.ok(itemsService.getItemById(id));
    }

    @PostMapping("/add")
    public void addItem(@RequestBody Items items){
        itemsService.addItem(items);
    }

    @PutMapping("/update/{id}")
    public void updateItem(@RequestBody Items items,@PathVariable int id){
        itemsService.updateItem(items,id);
    }

    @DeleteMapping("/delete-list")
    public void deleteAllItems(){
        itemsService.deleteAllItems();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteByItemId(@PathVariable int id){
        itemsService.deleteItemById(id);
    }
}
