package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
// import static org.junit.api.Assertions.*;
// import static org.junit.Assert.assertThrowsExactly;

public class BankAccountTest {

    @Test
    public void testSimpleDeposit() throws AccountNotActiveException {
        BankAccount hazemAccount = new BankAccount("00123", "Hazem");
        assertEquals(0, hazemAccount.getBalance());

        hazemAccount.deposit(100);

        assertEquals(100, hazemAccount.getBalance());
    }

    @Test
    public void testMultipleDeposit() throws AccountNotActiveException{
        BankAccount hazemAccount = new BankAccount("00123", "Hazem");
        assertEquals(0, hazemAccount.getBalance());

        hazemAccount.deposit(100);
        assertEquals(100, hazemAccount.getBalance());

        hazemAccount.deposit(50);
        assertEquals(150, hazemAccount.getBalance());
    }

    public void testDeactivatedAccountDeposit() {
        BankAccount hazemAccount = new BankAccount("00123", "Hazem");
        hazemAccount.deactivate();
        try{
            hazemAccount.deposit(100);
            fail("Expected AccountNotActiveException was not thrown");
        }
        catch (AccountNotActiveException e) {

        }
    }

    @Test
    public void testSimpleWithdraw() throws AccountNotActiveException, OverdraftException {
        BankAccount hazemAccount = new BankAccount("00123", "Hazem");
        hazemAccount.deposit(200);

        hazemAccount.withdraw(50);

        assertEquals(150, hazemAccount.getBalance());
    }

    @Test
    public void testDeactivatedAccountWithdraw() throws AccountNotActiveException, OverdraftException{
        BankAccount hazemAccount = new BankAccount("00123", "Hazem");
        hazemAccount.deposit(100);
        hazemAccount.deactivate();
        try {
            hazemAccount.withdraw(50);
            fail("Expected AccountNotActieException was not thrown");
        }
        catch (AccountNotActiveException e){
        }
    }

    @Test
    public void testOverdraftAllowed() throws AccountNotActiveException, OverdraftException {
        BankAccount hazemAccount = new BankAccount("00123", "Hazem");
        hazemAccount.deposit(100);
        try{
            hazemAccount.withdraw(300);
            fail("Expected OverdraftException was not thrown");
        }
        catch (OverdraftException e){
            assertEquals(100, e.getAmount());
        }
    }

    @Test
    public void testNonDefaultOverdraftLimit() throws OverdraftException, AccountNotActiveException{
        BankAccount hazemAccount = new BankAccount("00123", "Hazem");
        hazemAccount.setOverdraftLimit(500);
        hazemAccount.deposit(100);
        hazemAccount.withdraw(400);

        assertEquals(-300, hazemAccount.getBalance());

        try{
            hazemAccount.withdraw(400);
            fail("Expected OverdraftException was not thrown");
        }
        catch (OverdraftException e) {
            assertEquals(200, e.getAmount());
        }
    }

    @Test
    public void testOverdraftLimitException() {
        BankAccount hazemAccount = new BankAccount("00123", "Hazem");
        assertThrowsExactly(OverdraftException.class, () -> {
            hazemAccount.withdraw(400);
        });
    }
}


