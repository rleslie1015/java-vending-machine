package vend;

public interface AddProduct
{
    default void addProdcutToMachine(int productPosition, String productName, int price)
    {
        getProducts().add(new Product(productPosition, productName, price));
    }

}