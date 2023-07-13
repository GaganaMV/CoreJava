package Exception;

public class exceptionex {

	public static void main(String[] args) {
		try {
				String s="abc";
				int a=Integer.parseInt(s);
				System.out.println(a);
		
				String s1="11";
				int a1=Integer.parseInt(s1);
				System.out.println(a1);
	
		}
		
		catch (ArrayIndexOutOfBoundsException a)
		{
		System.out.println("Some Error in code." +a);
        }
		
		catch (ArithmeticException a)
	   {
	     System.out.println("no can't be divide by zero." +a);
       }
		catch (NumberFormatException a)
		   {
		     System.out.println("no format is not correct." +a);
	       }
		
		finally {
			System.out.println("end of finally block ");
		}

}
}
	
