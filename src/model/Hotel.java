package model;

public class Hotel {
    private long id ;
    private String name;
    private String location ;
    private int bankAccount;

    public Hotel(long id, String name, String location, int bankAccount) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.bankAccount = bankAccount;
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
