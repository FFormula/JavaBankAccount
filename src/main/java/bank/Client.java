package bank;

public class Client {
    private String name;
    private int year;

    public Client(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Klientas " + name + " (" + year + ")";
    }
}
