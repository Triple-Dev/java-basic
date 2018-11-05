package model;

//Person is the base class. It has the common attributes of all kind of possible persons.

public class Person {

    private int id;
    private String name;
    private Address address; //here the address is our own class.
    private String email;


    // No arguments constructor


    public Person() {
    }

    //All arguments Constructor

    public Person(int id, String name, Address address, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    /*all the getter and seter method.
     notice that the attributes of this class are private.
     so we can not access them from outside of the class, so we need to have public
     getter and setter method to access all the attribute. this is one kind of encapsulation.*/


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /* the to string method is for the String representation of this class Instance */

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                '}';
    }
}
