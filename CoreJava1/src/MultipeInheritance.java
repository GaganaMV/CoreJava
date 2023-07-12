package Abstract;

public class MultipeInheritance extends Child{

	public static void main(String[] args) 
	{
		 MultipeInheritance m=new MultipeInheritance();
		m.methodABC();
		m.methodPQR();
		m.methodXYZ();
		//m.methodChild();
		 
	}
	

	@Override
	public void methodABC()
	{
		System.out.println("ABC method");
	}
	
	@Override
	public void methodPQR()
	{
		System.out.println("PQR method");
	}
	@Override
	public void methodXYZ()
	{
		System.out.println("XYZ method");
	}
}
