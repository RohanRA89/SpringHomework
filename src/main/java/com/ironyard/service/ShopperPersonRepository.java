package com.ironyard.service;

import com.ironyard.data.ShopperPerson;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;

/**
 * Created by rohanayub on 2/1/17.
 */

public interface ShopperPersonRepository extends CrudRepository<ShopperPerson, Long> {
}
