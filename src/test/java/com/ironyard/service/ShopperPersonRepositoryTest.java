package com.ironyard.service;

import com.ironyard.data.ShopperPerson;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by rohanayub on 2/2/17.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ShopperPersonRepositoryTest {
    @Autowired
    ShopperPersonRepository myShopperPersonRepo;

    @Test
    public void testSaveShopperPerson() {
        ShopperPerson tmp = new ShopperPerson();
        tmp.setAddress("123 Home Ave.");
        tmp.setEmail("hello@world.com");
        tmp.setName("Test Customer");
        tmp.setPassword("pass123");
        myShopperPersonRepo.save(tmp);

        ShopperPerson found = myShopperPersonRepo.findOne(tmp.getId());
        Assert.assertEquals(tmp.getAddress(), found.getAddress());

    }
}