package main.vend;

import java.util.ArrayList;
import java.util.List;

public class Machine implements VendingMachine, VendingMachineHardwareFunctions, AddProduct
{
    //fields
    private int maxId = 0;
    private int id;
    private String name;
    private List<Product> products = new ArrayList<>();
    private int balance;

    public Machine(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name; 
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public void setProducts(List<Product> products)
    {
        this.products = products;
    }

    @Override
    public void buttonPress(Integer productPosition)
    {
        //loop through products and print product name and price with said product position
        for(Product p : products)
        {
            if(p.getProductPosition() == productPosition && balance < p.getPrice())
            {
                System.out.println(p.toString());
            };
            if(p.getProductPosition() == productPosition && balance >= p.getPrice())
            {
                dispenseProduct(p.getProductPosition(), p.getName());
                final int change = balance - p.getPrice();
                dispenseChange(change);
            }
        }

    }

    @Override
    public void addUserMoney(Integer cents)
    {
        balance = balance + cents;
    }

    @Override
    public void addProductToMachine(int productPosition, String productName, int price)
    {       
        getProducts().add(new Product(productPosition, productName, price));
    }

    @Override
    public String toString()
    {
        return "Machine{" + "maxId=" + maxId + ", id=" + id + ", name='" + name + '\'' + ", products=" + products + ", balance=" + balance + '}';
    }
}