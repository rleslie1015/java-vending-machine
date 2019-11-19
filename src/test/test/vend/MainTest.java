package test.vend;


import main.vend.Machine;
import main.vend.Product;

public class MainTest
{
    public static void main(String[] args)
    {
        System.out.println("*** VENDING Test***");

        //create a vending machine
        Machine SodaMachine = new Machine("Pepsi");
        SodaMachine.getProducts().add(new Product(1, "Test Pepsi", 45));
        SodaMachine.getProducts().add(new Product(2, "Test Big Red", 45));
        SodaMachine.getProducts().add(new Product(3, "Test Mountain Dew", 45));
        SodaMachine.getProducts().add(new Product(4, "Test Mug Root Beer", 45));

        SodaMachine.addProductToMachine(5, "Test Water", 75);
        System.out.println(SodaMachine.toString());


        System.out.println("User Presses 1");
        SodaMachine.buttonPress(1);
        SodaMachine.addUserMoney(25);
        SodaMachine.addUserMoney(25);
        SodaMachine.buttonPress(1);
    }
}
