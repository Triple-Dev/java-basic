package controller;

import model.Address;
import model.Customer;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CustomerController {



    public Customer addCustomer(){
        int id=1;
        String name="Jon Dao";
        String email="jondao@gmail.com"; //random email.
        double openindBalanch=1000;
        double totalPaid=500;
        double totalPurchased=300;
        LocalDate regDate=LocalDate.now();

        Address address=new Address("Bangladesh","dhaka","dhaka","1212");
        Customer customer=new Customer(id,name,address,email,openindBalanch,totalPaid,totalPurchased,regDate);

        return customer;
    }

}
