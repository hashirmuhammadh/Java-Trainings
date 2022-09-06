package model;

public class ATM {

    public static void main(String[] args){
        BankAccount bankaccount = new BankAccount();
        Customer customer = new Customer(bankaccount);
        Thread cus1 = new Thread(customer);
        Thread cus2 = new Thread(customer);

        cus1.setName("Hashir");
        cus2.setName("Muhammadh");

        cus1.start();
        cus2.start();
    }
}
