package Abstract;

abstract class A
{
   public  abstract static void func1();
   
   static void display() 
   {
	   
   }
}

class B extends A 
{

	
     void func1()
	{
		System.out.println("Static abstract method implemented.");
	}
}




public class AbstractwithStatic {

	public static void main(String[] args) 
	{
	  B b=new B();
		b.func1();
	}

}
