package model;

public class Address {
    private String country;
    private String state;
    private String city;
    private String postalCode;

    // No argument constractor
    public Address() {
    }

    //All arguments constructors

    public Address(String country, String state, String city, String postalCode) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.postalCode = postalCode;
    }



    /*all the getter and seter method.
     notice that the attributes of this class are private.
     so we can not access them from outside of the class, so we need to have public
     getter and setter method to access all the attribute. this is one kind of encapsulation.*/

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
