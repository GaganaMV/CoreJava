package Abstract;

public class c1 implements I2{
	
	public void show()
	{
		System.out.println("value of a:"+a);
		System.out.println("Value of b:"+b);
		
	}
	
	public static void main(String[] args) {
		c1 k=new c1();
		k.show();
		}

}
