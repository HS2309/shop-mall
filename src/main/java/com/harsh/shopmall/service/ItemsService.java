package com.harsh.shopmall.service;

import com.harsh.shopmall.model.Items;
import com.harsh.shopmall.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsService {

    @Autowired
    ItemsRepository itemsRepository;

    public List<Items> getAllItems(){
        return (List<Items>) itemsRepository.findAll();
    }

    public Items getItemById(int id){
        return itemsRepository.findById(id).get();
    }

    public Items addItem(Items items){
        return itemsRepository.save(items);
    }

    public Items updateItem(Items items,int id){
        items.setItemId(id);
        return itemsRepository.save(items);
    }

    public void deleteAllItems(){
        itemsRepository.deleteAll();
    }

    public void deleteItemById(int id){
        itemsRepository.deleteById(id);
    }
}
