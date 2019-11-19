package main.vend;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("*** VENDING MACHINE ***");
        

        //create a vending machine
        Machine SodaMachine = new Machine("Pepsi");
        SodaMachine.getProducts().add(new Product(1, "Pepsi", 45));
        SodaMachine.getProducts().add(new Product(2, "Big Red", 45));
        SodaMachine.getProducts().add(new Product(3, "Mountain Dew", 45));
        SodaMachine.getProducts().add(new Product(4, "Mug Root Beer", 45));

        SodaMachine.addProductToMachine(5, "Water", 75);
        System.out.println(SodaMachine.toString());
        

        System.out.println("User Presses 1");
        SodaMachine.buttonPress(1);
        SodaMachine.addUserMoney(25);
        SodaMachine.addUserMoney(25);
        SodaMachine.buttonPress(1);
    }
}
