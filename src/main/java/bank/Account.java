package bank;

public class Account {
    private String number;
    private int balance;
    private Client client;

    public Account(String number, Client client) {
        this.number = number;
        this.client = client;
        this.balance = 0;
    }

    public String getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    void addBalance(int amount) {
        balance += amount;
    }
}
