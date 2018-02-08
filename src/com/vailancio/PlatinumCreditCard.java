package com.vailancio;

public class PlatinumCreditCard extends Card{

    PlatinumCreditCard(){
        this.setCreditLimit(20000);
        this.setProcessor("VISA");
        this.setType("Platinum");
        this.setCurrency("INR");
    }
}
