package com.ironyard.service;

import com.ironyard.data.GroceryStore;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;

/**
 * Created by rohanayub on 2/1/17.
 */
@Entity
public interface GroceryStoreRepository extends CrudRepository<GroceryStore, Long>{



}
