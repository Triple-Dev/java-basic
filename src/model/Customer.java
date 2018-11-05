package model;

import java.time.LocalDate;

//Customer class inherit the Person class. because customer is a person first, then he has some more attribute of a customer
public class Customer extends Person {

    //all the attributes (Variables) and the method of Person class is available is this class.
    //if we create an instance of Customer class, first of the the constructor of Person class will be called.

    private double openingBalanch;
    private double currentBalanch;
    private double totalPaid;
    private double totalPurchased;
    private LocalDate regDate;

    public Customer() {
    }

    public Customer(int id, String name, Address address, String email, double openingBalanch, double totalPaid, double totalPurchased, LocalDate regDate) {

        //super is for initialize the base class or super class's(Person) attributes.
        super(id, name, address, email);
        this.openingBalanch = openingBalanch;
        this.totalPaid = totalPaid;
        this.totalPurchased = totalPurchased;
        this.regDate = regDate;

        //Current balance need to calciulate
        this.currentBalanch = this.openingBalanch+this.totalPaid-this.totalPurchased;
    }

    public double getOpeningBalanch() {
        return openingBalanch;
    }

    public void setOpeningBalanch(double openingBalanch) {
        this.openingBalanch = openingBalanch;
    }

    public double getCurrentBalanch() {
        return currentBalanch;
    }

    public void setCurrentBalanch(double currentBalanch) {
        this.currentBalanch = currentBalanch;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public double getTotalPurchased() {
        return totalPurchased;
    }

    public void setTotalPurchased(double totalPurchased) {
        this.totalPurchased = totalPurchased;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Customer{" +
                "openingBalanch=" + openingBalanch +
                ", currentBalanch=" + currentBalanch +
                ", totalPaid=" + totalPaid +
                ", totalPurchased=" + totalPurchased +
                ", regDate=" + regDate +
                "} ";
    }
}
