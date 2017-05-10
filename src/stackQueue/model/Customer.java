package stackQueue.model;

public class Customer
{
	private String name;
	private double height;
	private boolean isHappy;
	public Customer(String name, double height, boolean isHappy)
	{
		this.name = name;
		this.height = height;
		this.isHappy = isHappy;
	}
	public String toString()
	{
		String happy = "is not happy";
		if(isHappy)
		{
			happy = "is happy";
		}
		return name + happy + " and is " + Double.toString(height) + " feet tall";
	}
}
