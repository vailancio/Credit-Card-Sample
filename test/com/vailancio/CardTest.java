package com.vailancio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void card() {
        Card card = new Card();
        assertEquals(0, card.getCreditLimit());
    }
}