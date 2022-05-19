package com.ndcalabrese.test;

import animal_constructors.Animal;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalConstructorsTest {

    @Test
    @DisplayName("Test all constructors in animal_constructors.Animal" +
            " to see that name and isDog properties are set properly.")
    public void animalConstructorTest() {
        Animal test1 = new Animal("test1", false);
        Animal test2 = new Animal("test2");
        Animal test3 = new Animal(true);
        Animal test4 = new Animal();

        assertEquals("test1", test1.getName());
        assertFalse(test1.getIsDog());

        assertEquals("test2", test2.getName());
        assertFalse(test2.getIsDog());

        assertNull(test3.getName());
        assertTrue(test3.getIsDog());

        assertNull(test4.getName());
        assertFalse(test4.getIsDog());
    }

}
