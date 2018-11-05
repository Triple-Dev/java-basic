import controller.CustomerController;
import model.Customer;

public class MainClass {

    public static void main(String[] args){
        CustomerController customerController=new CustomerController();
        Customer customer=customerController.addCustomer();
        System.out.println(customer);
    }



    //please compleate the other controllers and use them from this main class. thank you.
}
