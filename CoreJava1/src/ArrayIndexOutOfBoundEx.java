package Exception;

public class ArrayIndexOutOfBoundEx {

	public static void main(String[] args) {
			try
			{
				int[] a = {1, 2, 3};
				System.out.println(a[50]);
				int c=10/0;
			}
			
			
			catch (ArrayIndexOutOfBoundsException a)
			{
			System.out.println("Some Error in code." +a);
            }
			
			catch (ArithmeticException a)
		   {
		     System.out.println("no can't be divide by zero." +a);
           }
			
			finally {
				System.out.println("Finally Block: ");
			}

   }
}