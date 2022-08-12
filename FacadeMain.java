import java.util.*;

class Process
{ 
	boolean giftcerti;
	int amt;
	int n;
	Scanner sc = new Scanner(System.in);
	
	public Process(boolean gf,int amt,int n)
	{
		giftcerti = gf;
		this.amt= amt;
		this.n   = n;
	}
	public void displayItems()
	{
		
		
		System.out.println("Enter the number of items to purchase");
		n= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the product name:");
			int prod = sc.nextInt();
			System.out.println("Enter the quantity of the product:");
			int qty = sc.nextInt();
			System.out.println("The product:"+" "+prod+" "+"Quantity"+" "+qty);
			
		}
	}
	
	public void Sales()
	{
		if(!giftcerti)
		{
			System.out.println("You do not have a gift certificate");
			System.out.println("Amount payable"+" "+amt);
		}
		else
		{
			System.out.println("Enter the gift  amount");
			float gfamt = sc.nextFloat();
			if(n<=0)
			{
				System.out.println("You do not have any items in your cart");
			}
			else if(n>1)
			{
				System.out.println("You can apply the gift certificate for one item only");
				
			}
			else if(amt>gfamt)
			{
				System.out.println("Pay amount"+(amt-gfamt));
			}
			else if(amt<gfamt)
			{
				System.out.println("Sorryy! no refund babe");
			}
		}
	}
}

class FacadePattern
{
	Process p;
	int m;
	
	public FacadePattern(boolean giftcerti,int amt)
	{
		p = new Process(giftcerti,amt,m);
	}
	
	public void showItemsPurchased()
	{
		System.out.println("Purchased Product Details");
		p.displayItems();
	}
	public void showBillAmount()
	{
		System.out.println("Bill Details");
		p.Sales();
	}
}

class FacadeMain
{
	public static void main(String[] args)
	{
		FacadePattern fd = new FacadePattern(true,100);
		fd.showItemsPurchased();
		fd.showBillAmount();
	}
}