import java.util.*;

abstract class Order
{
	public void order() 
	{
		selectItem();
		doPayment();
		doDelivery();
	}
	
	protected abstract void selectItem();
	protected abstract void doPayment();
	protected abstract void doDelivery();
}

class Offline extends Order
{
	Scanner sc = new Scanner(System.in);
	int ch;
	
	protected void selectItem()
	{
		System.out.println("Offline: Select these items(can also try these items):"
				+ "\n1. Item 1:100/- /n2.Item 2: 200/- ");
		
		ch=sc.nextInt();
				
	}
	
	protected void doPayment()
	{
		int val = 0;
		if(ch==1)
		{
			val=100;
			
		}
		else if(ch==2)
		{
			val=200;
		}
		System.out.println("Offline payment: Pay Cash/Swipe card"+val);
	}
	
	protected void doDelivery()
	{
		System.out.println("Offline Delivery: Collect items at the counter");
	}	
	
}

class Online extends Order
{
	Scanner sc = new Scanner(System.in);
	int ch;
	
	protected void selectItem()
	{
		System.out.println("Online: Select these items(can also try these items):"
				+ "\n1. Item 1:100/- /n2.Item 2: 200/- ");
		
		ch=sc.nextInt();
				
	}
	
	protected void doPayment()
	{
		int val = 0;
		if(ch==1)
		{
			val=100;
			
		}
		else if(ch==2)
		{
			val=200;
		}
		System.out.println("Online payment: Pay via UPI/Net banking"+val);
	}
	
	protected void doDelivery()
	{
		System.out.println("Online Delivery: Pay for shipping charges");
	}	
	
}

class TemplateMain
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int h;
		Order o;
		
		System.out.println("Do you want to order \n1.Online or \n2.shop Offline??? bruh");
		h=sc.nextInt();
		if(h==1)
		{
			o= new Online();
			System.out.println("Bruh you choose this:go ahead waste that salary");
			o.order();
		}
		else if(h==2)
		{
			o=new Offline();
			System.out.println("Okay welcome to our not so awesome store.Lets find something that doesn't fit you ma'am");
			o.order();
		}
		
		System.out.println("See ya again bruh!!");
	}
}


