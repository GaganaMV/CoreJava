package basic;
class Operation1 {
   void addition(int a,int b,int c) {
	   System.out.println("Addition of 3 numbers"+(a+b+c));
   }
   int divide(int a,int b) {
	   return a/b;
   }
   public static int add(int a,int b) {
	   return a + b;
  }
   public static int multipy (int a,int b) {
	   return a*b;
   }
}
 
public class Operation{         
	public static void main(String[] args) {
		Operation1 o=new Operation1();
		o.addition(1, 3, 50);
		System.out.println("division: "+o.divide(12,3));
		int result = Operation1.add(5,10);
		System.out.println("Addition: "+result);
		int maxno = Math.max(5,10);
	}
		

}

