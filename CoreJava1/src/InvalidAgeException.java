package Exception;

class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}

public class InvalidAgeException {
	public String checkAge(int age) throws MyException{
		if(age>18) {
			return "valid Age";
		}
			else {
				throw new MyException("Invalid Age");
				
			
			
		}
	}

	public static void main(String[] args) throws MyException{
	{
		InvalidAgeException  i=new InvalidAgeException();
	    i.checkAge(1);
		}
	}
}
