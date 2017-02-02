package com.ironyard.service;

import com.ironyard.data.GroceryStore;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by rohanayub on 2/1/17.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GroceryStoreRepositoryTest {
    @Autowired
    GroceryStoreRepository myGroceryStoreRepo;

    @Test
    public void testSaveGroceryStore(){
        GroceryStore newStore = new GroceryStore();
        newStore.setAisle(17);
        newStore.setStoreName("Wal-Mart");
        newStore.setItem("Milk");
        newStore.setStreetAddress("1234 Walmart Ave.");
        myGroceryStoreRepo.save(newStore);

        GroceryStore found = myGroceryStoreRepo.findOne(newStore.getId());
        Assert.assertEquals(newStore.getAisle(), found.getAisle());

        //myGroceryStoreRepo.delete(newStore);


    }

}