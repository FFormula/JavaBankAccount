package bank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    private final String CLIENT_NAME = "Jordan";
    private final int CLIENT_YEAR = 1970;
    private Client client;

    @Before
    public void setUp() throws Exception {
        client = new Client(CLIENT_NAME, CLIENT_YEAR);
    }

    @Test
    public void getName() {
        assertEquals(CLIENT_NAME, client.getName());
    }

    @Test
    public void getYear() {
        assertEquals(CLIENT_YEAR, client.getYear());
    }

    @Test
    public void testToString() {
        String expected = "Klientas " + CLIENT_NAME + " (" + CLIENT_YEAR + ")";
        assertEquals(expected, "" + client);
    }
}