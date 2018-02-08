package com.vailancio;

abstract class CardAbstract {
    private String type;
    private String processor;
    private int creditLimit;
    private String currency;
    private String validFrom;
    private String validTill;
    private String number;


    public int getCreditLimit() {
        return creditLimit;
    }

    protected void setCreditLimit(int creditLimit) {
        if(creditLimit < 0){
            throw new Error("Amount cannot be negative");
        }
        this.creditLimit = creditLimit;
    }

    public String getCurrency() {
        return currency;
    }

    protected void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    public String getProcessor() {
        return processor;
    }

    protected void setProcessor(String p) {
        this.processor = p;
    }

    public String getValidFrom() {
        return validFrom;
    }

    protected void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTill() {
        return validTill;
    }

    protected void setValidTill(String validTill) {
        this.validTill = validTill;
    }

    public String getNumber() {
        return number;
    }

    protected void setNumber(String number) {
        this.number = number;
    }
}