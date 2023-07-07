package oops;
class privatedemo{
	 int b=20;
	
	void display() {
		System.out.println("b :"+b);
	}
	
}
public class PrivateAccessSpecifier {
	private int a;
	

	public static void main(String[] args) {
		privatedemo d=new privatedemo();
		System.out.println("value of b :" +d.b);
		d.display();
		
		PrivateAccessSpecifier p=new PrivateAccessSpecifier();
		p.a=10;
		System.out.println(p.a);
		
		
	}

}
