package bank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DBankTest {
    DBank bank;

    @Before
    public void setUp() throws Exception {
        bank = new DBank();
    }

    @Test
    public void addClient() {
        assertEquals(0, bank.clients.size());
        Client client = new Client("Jordan", 1978);
        bank.addClient(client);
        assertEquals(1, bank.clients.size());
        assertEquals(client, bank.clients.get(0));
    }

    @Test
    public void addAccountToClient() {
        assertEquals(0, bank.accounts.size());
        Client client = new Client("Jordan", 1978);
        bank.addClient(client);
        String number = bank.addAccountToClient(client);
        assertEquals(1, bank.accounts.size());
        assertEquals(client, bank.accounts.get(0).getClient());
        assertEquals(number, bank.accounts.get(0).getNumber());
    }

    @Test
    public void getAccount() {
        // sukurti klienta
        Client client = new Client("Jordan", 1978);
        // uzregistruoti klienta
        bank.addClient(client);
        // priskirti saskaita ir atsiminti numeri
        String number = bank.addAccountToClient(client);
        // rasti saskaita pagal numeri
        Account account = bank.getAccount(number);
        assertEquals(number, account.getNumber());
        assertEquals(client, account.getClient());
        assertEquals(0, account.getBalance());

        assertNull(bank.getAccount("NOT-EXISTS"));
    }

    @Test
    public void getAccounts() {
        Client client = new Client("Jordan", 1978);
        bank.addClient(client);
        assertEquals(0, bank.getAccounts(client).size());
        bank.addAccountToClient(client);
        assertEquals(1, bank.getAccounts(client).size());
        bank.addAccountToClient(client);
        assertEquals(2, bank.getAccounts(client).size());
    }

    @Test
    public void getClient() {
        Client client = new Client("Jordan", 1978);
        assertNull(bank.getClient("Jordan"));
        bank.addClient(client);
        assertEquals(client, bank.getClient("Jordan"));
    }
}