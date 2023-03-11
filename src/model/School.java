package model;

public class School {
    private String name;
    private String address;
    private String phoneNumber;
    public School(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "name: " + name + " address: " + address + " phone number: " + phoneNumber;

    }
}
