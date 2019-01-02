package practice;
 
abstract class Vehicle
{
	abstract void car();
	abstract void Bike();
	
}


public class Abstraction extends Vehicle
{
      void car()
      {
    	  System.out.println("Car has four wheels");
      }


	void Bike() 
	{
         System.out.println("Bike has two wheels");
		
	}
	public static void main(String[] args) 
	{
		Abstraction a=new Abstraction();
		a.Bike();
		a.car();
	}
}
