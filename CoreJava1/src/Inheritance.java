package oops;

class Vehicle{
	void display()
	{
		System.out.println("Vehicle");
		
	}
	
	class Bike extends Vehicle{
	void displayb()
	{
		System.out.println("Bike");
	}
}
	
public class Inheritance {

	public static void main(String[] args) {
		
		//Inheritance d=new Inheritance();
		Vehicle d=new Vehicle();
		d.display();
		//d.displayb();
	}

}
