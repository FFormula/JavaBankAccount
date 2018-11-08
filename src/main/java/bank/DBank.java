package bank;

import java.util.ArrayList;

public class DBank {
    ArrayList<Client> clients;
    ArrayList<Account> accounts;

    DBank () {
        clients = new ArrayList<Client>();
        accounts = new ArrayList<Account>();
    }

    void addClient(Client client) {
        clients.add(client);
    }

    private void addAccount(Account account) {
        accounts.add(account);
    }

    String addAccountToClient(Client client) {
        String number = getFreeAccountNumber();
        Account account = new Account(number, client);
        addAccount(account);
        return number;
    }

    private String getFreeAccountNumber() {
        while (true) {
            String number = (Math.random() + "") // 0.0135456754
                    // 0123456789
                    //   ^^^^
                    .substring(2, 4); // 0135
            if (getAccount(number) == null)
                return number;
        }
    }

    Account getAccount(String number) {
        for (Account account : accounts)
            if (account.getNumber().equals(number))
                return account;
        return null;
    }

    ArrayList<Account> getAccounts(Client client) {
        ArrayList<Account> list = new ArrayList<Account>();
        for (Account account : accounts)
            if (account.getClient() == client)
                list.add(account);
        return list;
    }

    Client getClient(String name) {
        for (Client client : clients)
            if (client.getName().equals(name))
                return client;
        return null;
    }
}
