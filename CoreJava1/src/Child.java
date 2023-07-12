package Abstract;

public class Child implements XYZ {

	
	 
	 public void methodABC()
		{
			System.out.println("ABC method");
		}
		
	
		public void methodPQR()
		{
			System.out.println("PQR method");
		}
	
		public void methodXYZ()
		{
			System.out.println("XYZ method");
		}
	

	public static void main(String[] args) {
		Child c=new Child();
		c.methodABC();
		c.methodPQR();
		c.methodXYZ();
		
		
	}

}
