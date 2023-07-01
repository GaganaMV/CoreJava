package basic;
class Operation2{
	   void addition(int a,int b,int c) {
		   System.out.println("Addition of 3 numbers"+(a+b+c));
	   }
	   int divide(int a,int b) {
		   return a/b;
	   }
	   public static int add(int a,int b,int c) {
		   return a + b + c;
	  }
	   public static int multiply (int a,int b) {
		   return a*b;
	   }
	   
	}
public class TypesofMethods {

	public static void main(String[] args) {
		Operation2 o = new Operation2();
		o.add(1,3, 4);
		o.divide(10,2);
		o.multiply(2,10);
		System.out.println("Addition"+o.add(1,20,5));
		System.out.println("Division"+o.divide(20,5));
		System.out.println("Mulitply"+o.multiply(20,5));
		
		

	}

}
