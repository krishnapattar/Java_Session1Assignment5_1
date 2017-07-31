

/*
 * Create an abstract class Parent and define an abstract methods in it and implement it in the child
class
 */
	abstract class Vehicle//proper naming conventions is used 
	{
	   public abstract void engine();  
	}
	public class Car extends Vehicle {
	    
	    public void engine()
	    {
	        System.out.println("Car engine"); // printing   
	        //car engine implementation
	    }
	    
	    public static void main(String[] args){ // Main methods starts
	        Vehicle v = new Car();
	        v.engine();
	    }
	
}// class closed

