package com.vailancio;
import java.util.*;

public class CardOperation implements CardOperationInterface{
    protected String lockCodeHash;
    private boolean isLocked;
    protected User customer;
    protected Card card;
    ArrayList<Transaction> transactions =new ArrayList<Transaction>();


    public CardOperation(Card card) {
        this.isLocked = false;
        this.lockCodeHash = null;
        this.card = card;
    }

    public void setCreditLimit(int amount){
        this.card.setCreditLimit(amount);
    }


    public void displayDetails() {

        System.out.println("===============================");
        System.out.println("Type: " + this.card.getType());
        System.out.println("Number:" + this.card.getNumber());
        System.out.println("Processor: " + this.card.getProcessor());
        System.out.println("Balance: " + this.card.getCurrency() + " " + this.getBalance());
        System.out.println("Credit Limit: " + this.card.getCurrency() + " " + this.card.getCreditLimit());
        System.out.println("Valid From: " + this.card.getValidFrom());
        System.out.println("Valid Till: " + this.card.getValidTill());
        //System.out.println("Secure Code Set:",this.isSecured ? "YES" : "NO");
        System.out.println("===============================");
    }

    public void unlock(String code){
        if(!this.isLocked){
            throw new Error("Sorry this card is not locked yet.");
        }

        if(this.lockCodeHash == code){
            this.isLocked = false;
        }else{
            throw new Error("Invalid unlock code.");
        }


    }

    public void lock(){
        if(this.lockCodeHash == null){
            throw new Error("Sorry this is not possible. Lock code not set.");
        }
        this.isLocked = true;
    }

    public void setLockCode(String code){
//        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
//        messageDigest.update(code.getBytes());
//        String encryptedString = new String(messageDigest.digest());

        //My JVM is throwing error for most of hashing algos. I taking a shortcut here for this test
        this.lockCodeHash = code;
        this.isLocked = true;
    }

    public boolean isLocked(){
        return this.isLocked;
    }

    public void setCustomer(User user){
        this.customer = user;
    }


    public void debit( float amount){
        if(amount < 0){
            throw new Error("Amount cannot be negative");
        }

        if(this.getBalance() < amount){
            throw new Error("Sorry this user does not have enough balance.");
        }
        this.transactions.add(new Transaction(amount,Type.DEBIT));
    }

    public void credit(float amount){
        if(amount < 0)
            throw new Error("Amount cannot be negative");

        this.transactions.add(new Transaction(amount,Type.CREDIT));
    }


    public float getBalance(){

        int i;
        float balance = 0;
        for(i = 0; i < this.transactions.size(); i++)

            if(this.transactions.get(i).type == Type.DEBIT){
                balance = balance - this.transactions.get(i).amount;
            }else if(this.transactions.get(i).type == Type.CREDIT){
                balance = balance + this.transactions.get(i).amount;
            }

        return balance;

    }

}