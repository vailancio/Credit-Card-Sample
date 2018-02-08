package com.vailancio;

public interface CardOperationInterface {
    public void setCreditLimit(int amount);
    public void debit(float amount);
    public void credit(float amount);
    public void displayDetails();
    public void setLockCode(String code);
    public void unlock(String code);
    public void lock();

}