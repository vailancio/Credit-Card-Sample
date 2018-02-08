package com.vailancio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardOperationsTest {
    //private CardOperation cc;


    @Test
    void setCreditLimit() {
        Card card = CardFactory.getCard("Platinum");
        CardOperation cc = new CardOperation(card);
        assertEquals(20000, card.getCreditLimit());
        cc.setCreditLimit(20000);
        assertEquals(20000, card.getCreditLimit());

        //assertThrows(,)
    }

    @Test
    void debit() {
        Card card = CardFactory.getCard("Platinum");
        CardOperation cc = new CardOperation(card);
        assertEquals(0, cc.getBalance());
        cc.credit(500);
        cc.debit(200);
        assertEquals(300, cc.getBalance());
    }

    @Test
    void credit() {
        Card card = CardFactory.getCard("Platinum");
        CardOperation cc = new CardOperation(card);
        assertEquals(0, cc.getBalance());
        cc.credit(20000);
        assertEquals(20000, cc.getBalance());
    }


    @Test
    void setLockCode() {
        Card card = CardFactory.getCard("Platinum");
        CardOperation cc = new CardOperation(card);

        cc.setLockCode("9787");
        assertTrue(cc.isLocked());

    }

    @Test
    void unlock() {
        Card card = CardFactory.getCard("Platinum");
        CardOperation cc = new CardOperation(card);

        cc.setLockCode("9787");
        assertTrue(cc.isLocked());

        cc.unlock("9787");
        assertFalse(cc.isLocked());
    }

    @Test
    void lock() {
        Card card = CardFactory.getCard("Platinum");
        CardOperation cc = new CardOperation(card);

        cc.setLockCode("9787");
        assertTrue(cc.isLocked());

        cc.unlock("9787");
        assertFalse(cc.isLocked());

        cc.lock();
        assertTrue(cc.isLocked());
    }


}