package bank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void getNumber() {
        Client client = new Client("Jackson", 1965);
        Account account = new Account("12345", client);
        assertEquals("12345", account.getNumber());
    }

    @Test
    public void getBalance() {
        Client client = new Client("Jackson", 1965);
        Account account = new Account("12345", client);
        assertEquals(0, account.getBalance());
    }

    @Test
    public void getClient() {
        Client client = new Client("Jackson", 1965);
        Account account = new Account("12345", client);
        assertEquals(client, account.getClient());
    }

    @Test
    public void addBalance() {
        Client client = new Client("Jackson", 1965);
        Account account = new Account("12345", client);
        account.addBalance(250);
        assertEquals(250, account.getBalance());
    }

}