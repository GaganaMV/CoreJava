package Exception;

public class UserDefinedMovieExusingstatic {

	static void validateAge(int age)
	 
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
	public static void main(String[] args) throws Exception
	{
		validateAge(22);
	}

}
