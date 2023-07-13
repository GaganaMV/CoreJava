package Exception;

public class ClassNotFoundEx {
//compile timeex/checkedexception
	//classnotfoundex,IOException,SQLException
	public static void main(String[] args) {
		try 
		{
			//Class.forName("class not exist");
			Class.forName("basic.Enum");
			System.out.println("Class Found");
		}
		catch(ClassNotFoundException e) 
		{
			//e.printStackTrace();
			System.out.println(e);
		}

	}

}
