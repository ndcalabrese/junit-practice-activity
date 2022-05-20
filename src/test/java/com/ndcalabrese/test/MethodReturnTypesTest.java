package com.ndcalabrese.test;

import method_return_types.MethodReturnTypes;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MethodReturnTypesTest {

    @Test
    public void returnsStringTest() {
        assertEquals("String of text", MethodReturnTypes.returnsString());
    }

    @Test
    public void returnsInt() {
        assertEquals(5, MethodReturnTypes.returnsInt());
    }

    @Test
    public void returnsBoolean() {
        assertFalse(MethodReturnTypes.returnsBoolean());
    }

}