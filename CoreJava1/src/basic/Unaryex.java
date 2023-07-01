package basic;

public class Unaryex {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = x++;
		int a = x--;
		int b = 20; 
		 int c = ++b * 10 / b++ + ++b;
		//System.out.println("Post increment"+(x++));
		System.out.println("Pre increment"+(++y));
		System.out.println("Post increment"+z);
		System.out.println("Post decrement"+a);
		System.out.println("Post decrement"+b);
		System.out.println("Post decrement"+c);
        System.out.println("Tild operator" +(~x));
        
	}

}
