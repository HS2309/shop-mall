package com.harsh.shopmall.service;

import com.harsh.shopmall.model.Vender;
import com.harsh.shopmall.repository.VenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenderService {

    @Autowired
    VenderRepository venderRepository;

    public List<Vender> getAllVenders(){
        return (List<Vender>) venderRepository.findAll();
    }

    public Vender getVenderById(int id){
        return venderRepository.findById(id).get();
    }

    public Vender addVender(Vender vender){
        venderRepository.save(vender);
        return vender;
    }

    public Vender updateVender(Vender vender,int id){
        vender.setVenderId(id);
        venderRepository.save(vender);
        return vender;
    }

    public void deleteAllVenders(){
        venderRepository.deleteAll();
    }

    public void deleteVenderById(int id){
        venderRepository.deleteById(id);
    }
}
