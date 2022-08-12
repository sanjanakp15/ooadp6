import java.util.*;

abstract class GetCurrentStock
{
	
	public abstract void stock();
}


class BasicStock extends GetCurrentStock
{

	@Override
	public void stock()
	{
		System.out.println("Basic stocks: 150");
	}
	
}

 abstract class SportsStock extends GetCurrentStock
{
	public GetCurrentStock basicstock = new BasicStock();
	
	SportsStock()
	{
		basicstock.stock();
	}
	
	public abstract void stock();
}
 
 
 abstract class Indoor extends SportsStock
 {
	 public abstract void stock();
 }

 
abstract class Outdoor extends SportsStock
{
	public abstract void stock();
}

class Adventure1 extends Outdoor
{
	public void stock()
	{
		System.out.println("Stock of outdoor adventure");
	}
}

class Athle extends Outdoor
{
	public void stock()
	{
		System.out.println("Stock of outdoor athtletics");
	}
}

class Board extends Indoor
{
	public void stock()
	{
		System.out.println("Stock of indoor Board Games");
	
	}
}

class TableGames extends Outdoor
{
	public void stock()
	{
		System.out.println("Stock of indoor Table Games");
	}
}

class DecoratorMain
{
	public static void main(String[] args)
	{
		GetCurrentStock cs = null ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice \n1.Outdoor \n2.Indoor");
		int ch = sc.nextInt();
		if(ch==1)
		{
			System.out.println(" Outdoor Games\nEnter your choice\n 1. Adventure Sports\n 2.Athlete Sports");
			int h= sc.nextInt();
			if(h==1)
			{
				cs = new Adventure1();
			}
			else if(h==2)
			{
				cs = new Athle();
			}
		}
		
		else
		{
			System.out.println("Indoor Games\n Enter your choice\n1.Board Games\n2.Table Games");
			int j=sc.nextInt();
			if(j==1)
			{
				cs=new Board();
			}
			else if(j==2)
			{
				cs= new  TableGames();
			}
		}
		
		cs.stock();
		
	}
}


