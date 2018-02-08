package com.vailancio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardUtilityTest {

    @Test
    void getNewNumber() {
        String genNumber = CardUtility.getNewNumber();
        assertNotNull(genNumber);
        assertEquals(16, genNumber.length());
    }
}