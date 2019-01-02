package practice;

public class HighestNo 
{
	int a;
	int b;
	int c;
	public void highest(int a,int b,int c)
	{
		if(a>b && a>c )
		{
			System.out.println(a); 
		}
		if(b>a && b>c)
			{			
			System.out.println(b);
			}
		else 
		{
			System.out.println(c);
		}
		if(b>c)
		{
			System.out.println(b);
		}
		/*else 
		{
			System.out.println(c);
		}*/
	}
	
	
		
	

	public static void main(String[] args) 
	{
		HighestNo n=new HighestNo();
		n.highest(100, 10, 30);
	}

}
