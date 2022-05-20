package com.ndcalabrese.test;

import hashmap_IOU.IOU;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IOUTest {

    IOU test = new IOU();

    @Test
    @DisplayName("Test setSum and howMuchDoIOweTo methods in hashmap_IOU.IOU class" +
            " to see that class method sets and returns the correct hashmap value pair")
    public void IOUsetterTest() {
        test.setSum("Test1", 100.50);
        assertEquals(100.50, test.howMuchDoIOweTo("Test1"));
    }

    @Test
    public void getPeopleOwedTest() {
        test.setSum("Test1", 100.50);
        test.setSum("Test2", 200.0);
        Collection<String> collection = new ArrayList<>();
        collection.add("Test1");
        collection.add("Test2");
        assertEquals(String.valueOf(collection), String.valueOf(test.getListOfPeopleOwed()));
    }



}
