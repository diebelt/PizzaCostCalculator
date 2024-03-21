package org.example;

public class BankAccount {
    private String iban;
    private String holderName;
    private int balance;
    private boolean active;
    private int overdraftLimit = 100;

    //int, double, float, boolean

    public BankAccount(String iban, String holderName) {
    this.iban = iban;
    this.holderName = holderName;
    active = true;
    }

    public String getIban() {
        return iban;
    }

    public String getHolderName() {
        return holderName;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "iban='" + iban + '\'' +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance +
                ", active=" + active +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
    public void deposit(int amount) throws AccountNotActiveException {
        if (!active) {
            throw new AccountNotActiveException();
        }
        this.balance = this.balance + amount;
    }

    public void withdraw(int amount) throws AccountNotActiveException, OverdraftException {
        if (!active) {
            throw new AccountNotActiveException();
        }
        int newBalance = this.balance - amount;
        if (newBalance < -overdraftLimit) {
            throw new OverdraftException(-(newBalance + overdraftLimit));
        }
        this.balance = newBalance;
    }

    public void deactivate() {
        this.active = false;
    }

        public void setOverdraftLimit (int overdraftLimit) {
            this.overdraftLimit = overdraftLimit;
        }
}
