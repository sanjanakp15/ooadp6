
import java.util.*;

abstract class Adventure
{
	String name;
}
abstract class OutRegular
{
	String name;
}

class Paraglide extends Adventure
{
	public Paraglide(String name)
	{
		this.name = name;
	}
}
class Bungee extends Adventure
{
	public Bungee(String name)
	{
		this.name = name;
	}
}


class Cricket extends OutRegular
{
	public Cricket(String name)
	{
		this.name = name;
	}
}


class TableTennis extends OutRegular
{
	public TableTennis(String name)
	{
		this.name = name;
	}
}

abstract class Factory
{
	public abstract void getOutSport();
	public abstract void getRegSport();
	public abstract void display();
}


class Regular extends Factory
{
	Adventure a;
	OutRegular o;
	
	Scanner sc = new Scanner(System.in);
	public void getOutSport()
	{
		System.out.println("1.Paragliding\n2.Bungee");
		int ch = sc.nextInt();
		if(ch==1)
		{
			this.a=new Paraglide("Paragliding");
		}
		if(ch==2)
		{
			this.a=new Bungee("Bungee");
		}
	}
	
	public void getRegSport()
	{
		System.out.println("1.Cricket\n2.Table Tennis");
		int hc = sc.nextInt();
		if(hc==1)
		{
			this.o=new Cricket("Cricket");
		}
		if(hc==2)
		{
			this.o=new TableTennis("Table Tennis");
		}
	}
	
	public void display()
	{
		System.out.println("Regular"+a.name+"\nRegular"+o.name);
	}
	
	
}

class DiffAbled extends Factory
{
	Adventure a;
	OutRegular o;
	
	Scanner sc = new Scanner(System.in);
	public void getOutSport()
	{
		System.out.println("1.Paragliding\n2.Bungee");
		int ch = sc.nextInt();
		if(ch==1)
		{
			this.a=new Paraglide("Paragliding");
		}
		if(ch==2)
		{
			this.a=new Bungee("Bungee");
		}
	}
	
	public void getRegSport()
	{
		System.out.println("1.Cricket\n2.Table Tennis");
		int hc = sc.nextInt();
		if(hc==1)
		{
			this.o=new Cricket("Cricket");
		}
		if(hc==2)
		{
			this.o=new TableTennis("Table Tennis");
		}
	}
	
	public void display()
	{
		System.out.println("DiffAbled"+a.name+"\nDiffAbled1"+o.name);
	}
	
	
}

class AbstractMain
{
	public static void main(String[] args)
	{
		Factory af;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a choice");
		
		int ch = sc.nextInt();
		if(ch==1)
		{
			af = new Regular();
			af.getOutSport();
			af.getRegSport();
			af.display();
		}
		
		if(ch==2)
		{
			af = new DiffAbled();
			af.getOutSport();
			af.getRegSport();
			af.display();
		}
	}
}



