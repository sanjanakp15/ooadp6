import java.util.*;

abstract class Subject
{
	 abstract void detach(Observer1 o);
	 abstract void attach(Observer1 o);
	 abstract void notifyObservers();
	
}



class Store extends Subject
{
	String name;
	float discount;
	
	ArrayList<Observer1> ol;
	
	public Store(String name,float discount)
	{
		this.name = name;
		this.discount = discount;
		ol = new ArrayList<Observer1>();
	}
	
	@Override
	public void attach(Observer1 o)
	{
		ol.add(o);
		System.out.println(" Added customer"+o+"To store"+name);
	}
	
	@Override
	public void detach(Observer1 o)
	{
		try {
			ol.remove(ol.indexOf(o));
			System.out.println(" Removed customer"+o+"from store"+name);
	      }
		
		catch(NullPointerException e)
		{
			System.out.println(" No such customer"+o+"in store"+name);
		}
	}
	@Override
	public void notifyObservers()
	{
		for(Observer1 o : ol)
		{
			o.update(discount);
		}
	}
	
	public void setDiscount(String festival,float d)
	{
		discount = d;
		System.out.println(" New Discount Offer"+festival);
		notifyObservers();
	}
	
}
	
abstract class Observer1
{
	abstract void update(float discount);
}

class Customer extends Observer1
{
	Subject str;
	float discount;
	String name;
	
	public Customer(String name,Subject str)
	{
		this.name=name;
		this.str=str;
	}
	
	@Override
	public void update(float discount)
	{
		this.discount = discount;
		System.out.println(name+"You get a discount");
				
	}
	
	public String toString()
	{
		return name;
	}
}

class New
{
	public static void main(String[ ]args)
	{
		
	
		Store s1 = new Store("Sanja",10);
		
		Customer c1 = new Customer("Sanja",s1);
		Customer c2 = new Customer("Sahana",s1);
		
		s1.setDiscount("Holi",10);
		
		s1.detach(c2);
		
		s1.setDiscount("Diwali",10);
		
		Customer c3 = new Customer("Rahul",s1);
		s1.setDiscount("Ugadi",40);
	
	
	}
	
}