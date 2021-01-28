package com.greenfox.groottest.services;

import com.greenfox.groottest.error.NoInputException;
import com.greenfox.groottest.models.Arrow;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class YonduServiceTest {


    @Test
    public void makeNewArrow() throws NoInputException {
        YonduService testService = new YonduService();
       Arrow arrow = new Arrow(100.0,10.0);

        testService.getSpeed(100.0, 10.0);
        Assert.assertEquals(arrow,new Arrow(100.0, 10.0));

    }


}