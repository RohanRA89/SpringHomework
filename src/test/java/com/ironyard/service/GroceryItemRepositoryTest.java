package com.ironyard.service;

import com.ironyard.data.GroceryItem;
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
public class GroceryItemRepositoryTest {
    @Autowired
    GroceryItemRepository myGroceryItemRepo;

    @Test
    public void testSaveGroceryItem(){
        GroceryItem itemOne = new GroceryItem();
        itemOne.setAisle(17);
        itemOne.setItem("Milk");
        itemOne.setQuantity(1);
        itemOne.setType("Drink");
        myGroceryItemRepo.save(itemOne);

        GroceryItem found = myGroceryItemRepo.findOne(itemOne.getId());
        Assert.assertEquals(itemOne.getItem(), found.getItem());

        myGroceryItemRepo.delete(itemOne);


    }

//    @Test
//    public void testRemoveGroceryItem(){
//        GroceryItem tmp = new GroceryItem();
//        tmp.setAisle(17);
//        tmp.setItem("Milk");
//        tmp.setQuantity(1);
//        tmp.setType("Drink");
//        myGroceryItemRepo.save(tmp);
//
//        GroceryItem found = myGroceryItemRepo.findOne(tmp.getId());
//        Assert.assertNotNull(found);
//
//        myGroceryItemRepo.delete(tmp);
//        GroceryItem remove = myGroceryItemRepo.delete(tmp.getId(found);
//
//        Assert.assertNull(found);



    }

