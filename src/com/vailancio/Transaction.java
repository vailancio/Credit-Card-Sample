package com.vailancio;
import java.util.Date;

enum Type {DEBIT, CREDIT};

public class Transaction {

    public Date dated;
    public float amount;
    public Type type;

    Transaction(float amount, Type type){
        this.type = type;
        this.amount = amount;
    }
}
