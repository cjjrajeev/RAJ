package practice;

import java.util.Scanner;

public class Switch_Traffic 
{
	
    
	public static  void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please enter the colour");
		
		 String colour=sc.nextLine();
	         switch( colour)
	         {
	         case "red":
	        	 System.out.println("you should stop");
	            break;
	         case "Orange":
	        	 System.out.println("Caution:Wait for 30sec");
	        	 break;
	         case "amber":
	             System.out.println("Caution:Wait for 10sec");
	             break;
	         case "yellow":
	        	 System.out.println("Be ready");
	             break;
	         case "Green":
	        	 System.out.println("Proceed");
	        	 break;
	         
	        
	         }
	        	 

	}

}
