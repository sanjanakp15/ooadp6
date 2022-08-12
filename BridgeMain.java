
import java.util.*;

abstract class CustomerB
{
	String name;
	String typeOfCustomer;
	DiscountB db;
    
	public CustomerB(String n, DiscountB db)
	{
		name = n;
		this.db=db;
	}
	
	
	public void printBill()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount payable\n");
		float n= sc.nextFloat();
		
		System.out.println("Name"+name);
		System.out.println("Type of Customer"+typeOfCustomer);
		System.out.println("Amount"+n);
		System.out.println("Discount available"+db.getDiscounts(n));
	}
	
	public void setDiscount(DiscountB db)
	{
		this.db=db;
	}
	
}
interface DiscountB
{
	public float getDiscounts(float amt);
}

class Discount11 implements DiscountB
{

	@Override
	public float getDiscounts(float amt) {
		// TODO Auto-generated method stub
		return 0.15f*amt;
	}
	
}

class Discount22 implements DiscountB
{

	@Override
	public float getDiscounts(float amt) {
		// TODO Auto-generated method stub
		return 0.30f*amt;
	}
	
}

class RCCustomer1 extends CustomerB
{
	public RCCustomer1(String name,DiscountB db)
	{
		super(name,db);
		typeOfCustomer = "Regular Customer";
	}
}

class FTCustomer1 extends CustomerB
{
	public FTCustomer1(String name,DiscountB db)
	{
		super(name,db);
		typeOfCustomer = "First time Customer";
	}
}

class BridgeMain
{
	public  static void main(String[] args)
	{
		CustomerB c1 = new RCCustomer1("Sanjana",new Discount11());
		c1.printBill();
		
		System.out.println("Amount after new discount\n");
		c1.setDiscount(new Discount22());
		c1.printBill();
	}
}