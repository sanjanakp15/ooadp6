import java.util.*;


class TabWindow
{
	public static TabWindow tb;
	
	ArrayList<String> urls = new ArrayList<>();
	
	private TabWindow()
	{
		urls = new ArrayList<String>();
	}
	
	public static TabWindow getInstance()
	{
		if(tb==null)
		{
			tb = new TabWindow();
		}
		return tb;
	}
	
	public void addUrls(String url)
	{
		urls.add(url);
	}
	public void showUrls()
	{
		for(String u : urls)
		{
			System.out.println(u);
		}
	}
}

public class SingletonMain 
{
   public static void main(String[] args)
   {
	   TabWindow s1 = TabWindow.getInstance();
	   TabWindow s2 = TabWindow.getInstance();
	   
	   s1.addUrls("www.google.com");
	   
	   s2.addUrls("www.FaceBook.com");
	   
	   TabWindow s3 = TabWindow.getInstance();
	   s3.showUrls();
   }
}