package practice;

public class BubbleSort 
{
       public static void main(String[] args) {
		int[] a= {20,10,5,90};
		boolean flag=true;
		
		int temp;
		while(flag)
		{
			flag=false;
			for(int i=0;i<a.length-1;i++) 
			{
			    if(a[i]>a[i+1])
			    {
			    	temp=a[i];
			    	a[i+1]=a[i];
			    	a[i]=a[i+1];
			    	flag=true;
			    }
			    ;
			}
			
		}
	   
       }
       
}
