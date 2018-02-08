package com.vailancio;

public class EliteCreditCard extends Card{

    EliteCreditCard(){

        this.setType("Elite");
        this.setProcessor("MasterCard");
        this.setCreditLimit(1000000);
        this.setCurrency("INR");

    }
}