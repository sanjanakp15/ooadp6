import java.util.*;

abstract class CustomerF
{
	public abstract void printCustomer();
	public abstract void printRate();
	
	public CustomerF()
	{
		printCustomer();
		printRate();
	}
}

class Aged extends CustomerF
{
	public void printCustomer()
	{
		System.out.println("This range is for Senior Citizens");
	}
	public void printRate()
	{
		System.out.println("Discount of 8%");
	}
}

class Teen extends CustomerF
{
	public void printCustomer()
	{
		System.out.println("This range is for Teenagers");
	}
	public void printRate()
	{
		System.out.println("Discount of 5.8%");
	}
}

class Kids extends CustomerF
{
	public void printCustomer()
	{
		System.out.println("This range is for Children");
	}
	public void printRate()
	{
		System.out.println("Discount of 5%");
	}
}

class CustomerFactory
{
	public CustomerF factory(String ctype)
	{
		if(ctype.equalsIgnoreCase("Aged"))
		{
			return new Aged();
		}
		else if(ctype.equalsIgnoreCase("Teens")) 
		{
			return new Teen();
		}
		else if(ctype.equalsIgnoreCase("Kids"))
			{
			    return new Kids();
			    		
			}
		return null;
		
		
	}
}

class FactoryMain
{
	public static void main(String args[])
	{
		CustomerFactory cf = new CustomerFactory();
		cf.factory("Kids");
	}
}