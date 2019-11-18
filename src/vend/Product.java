package vend;

public class Product
{
	//fields
	private int productPosition;

	private String name;

	private int price;

	//constructor


	public Product(int productPosition, String name)
	{
		this.productPosition = productPosition;
		this.name = name;
	}

	public Product(int productPosition, String name, int price)
	{
		this.productPosition = productPosition;
		this.name = name;
		this.price = price;
	}

	//getters
	public int getProductPosition()
	{
		return productPosition;
	}

	public void setProductPosition(int productPosition)
	{
		this.productPosition = productPosition;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;

	}

	@Override
	public String toString()
	{
		return "**" + name  + " " + price + " cents**";
	}
}
