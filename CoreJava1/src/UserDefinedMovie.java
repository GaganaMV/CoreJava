package Exception;

import basic.staticex;

public class UserDefinedMovie {
	
	//static void validateAge(int age)
	 void validateAge(int age)
	{
		if(age>18)
		{
			System.out.println("Welcome to Movie");
		}
		else 
		{
			throw new ArithmeticException("Invalid Age for Movie");
			
		}
	}
     
	public static void main(String[] args)throws Exception
	{
		//validateAge(22);
		UserDefinedMovie u=new UserDefinedMovie();
		u.validateAge(22);

	}

}
