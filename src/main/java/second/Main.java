package second;

import second.Inheritance.Customer;

public class Main {

    public static void main(String[] args) {

        ReCapDemo reCapDemo = new ReCapDemo();
        int cem = reCapDemo.topla(5, 10);
        System.out.println(cem);
        Encapsulation encapsulation = new Encapsulation("Rufet", "Huseynov", "20", "1");


        // -----------------------------------Inheritance

        Customer customer = new Customer();
        customer.name = "Rufet";
    }

}
