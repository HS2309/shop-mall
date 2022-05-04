package com.harsh.shopmall.repository;

import com.harsh.shopmall.model.Items;
import org.springframework.data.repository.CrudRepository;

public interface ItemsRepository extends CrudRepository<Items,Integer> {
}
