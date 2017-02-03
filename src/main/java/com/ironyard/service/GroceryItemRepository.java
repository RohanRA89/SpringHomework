package com.ironyard.service;

import com.ironyard.data.GroceryItem;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;

/**
 * Created by rohanayub on 2/1/17.
 */

public interface GroceryItemRepository extends CrudRepository<GroceryItem, Long>{

}
