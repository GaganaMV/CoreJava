package oops;

public class Methodover {
	public int sum(int x, int y) 
	{ 
		return (x + y); 
	}
	
	public int triangle(int k,int b, int h) 
	{ 
		return (k* b * h); 
	}
	

	public static void main(String[] args) {
		 Sum s = new Sum();
	     System.out.println(s.sum(10, 20));
          
	     Methodover t = new Methodover();
	     System.out.println(t.triangle(5,10,20));
	}

}
