

interface Calculator
{
	public int calTax(int qty, float amt);
}

class GST implements Calculator
{
	@Override
	public int calTax(int qty, float amt)
	{
		return (int)(qty*amt*0.18f);
	}
	
}

class MauriTax
{
	public int mauriTax(int qty, float amt)
	{
		return (int)(qty*amt*0.1f);
		
	}
}

class MauriAdapter implements Calculator
{
	MauriTax mt = new MauriTax();
	
	@Override
	public int calTax(int qty, float amt)
	{
		return mt.mauriTax(qty,amt);
	}
}


	
class Item
	{
		String name;
		int qty;
		float amt;
		Calculator ct;
		
		public Item (String name,int qty, float amt, Calculator ct)
		{
			this.name = name;
			this.qty = qty;
			this.amt = amt;
			this.ct= ct;
		}
	
	public void setTax(Calculator ct)
	{
		this.ct = ct;
	}
	
	public void display()
	{
		System.out.println("\nName:"+name);
		System.out.println("Quantity:"+qty);
		System.out.println("Amount:"+amt);
		
		float tax = ct.calTax(qty,amt);
		float bill = (qty*amt)+tax;
		
		System.out.println("The Tax Amount:"+tax);
		System.out.println("Bill Amount:"+bill);
		
		
	}
	
	
}

class AdapterMainn
{
	public static void main(String[] args)
	{
		Calculator ct = new MauriAdapter();
		Item il = new Item("Sanjana",2,100, ct);
		il.display();
		
		System.out.println("After GST Bill");
		il.setTax(new GST());
		il.display();
	}
}
	
	