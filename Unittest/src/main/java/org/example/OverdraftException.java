package org.example;

public class OverdraftException extends Exception{
    private int amount;
    public OverdraftException(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }

}
