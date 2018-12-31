package practice;

public class Electrical_Billing
{
        static int unit=265;
        
      static  double discount=(5/265)*100;
         static double amt=0;
        static int arrear=100;
       static  double interest= arrear*0.1;
       static double finalamt;
         
         
	
      public static void main(String[] args) 
      {
    	  if(unit<=50)
    	  {
    		  amt=amt+1.20*unit;
    		  System.out.println("amt is"+ amt);
    	  }
    	  if(unit>50 && unit <=100)
    	  {
    		  amt=(50*1.2)+(unit-50)*2.40;
    		  System.out.println("amt is"+amt);
    	  }
    	  if(unit>100 && unit <150)
    	  {
    		  amt=(50*1.2)+(50*2.4)+(unit-100)*3.60;
    		  System.out.println("amt is"+amt);
    	  }
    	  if(unit>150 && unit<=200)
    	  {
    		  amt=(50*1.20)+(50*2.40)+(50*3.60)+(unit-150)*4.80;
    		  System.out.println("amt is"+amt);
    	  }
    	  if(unit>200)
    	  {
    		
    		   amt=((50*1.2)+(50*2.4)+(50*3.60)+(unit-200)*4.80)-discount;
    		   System.out.println("amt is"+amt);
    		  
    	  }
    	  if(arrear>0)
    	  {
    		  double finalamt=amt+interest+arrear;
    		  System.out.println(finalamt);
    	  }
    	  
	  	
    	}
}
