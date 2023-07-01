package basic;

public class Typecasting {

	public static void main(String[] args) {
		int number1=10;
		System.out.println("The integer value is"+number1);
		
		short number2=(short)number1;
		System.out.println("The narrowed value is"+number2);
		
		//narrowing->bigger to smaller
		double d= 76.9;
		byte b=(byte)d;
		int i=(int)d;
		float f=(float)d;
		System.out.println(b);
		System.out.println(i);
		System.out.println(f);
		
		//wideing->smaller to bigger
		byte k=8;
		int ii=k;
		float ff=k;
		double dd=k;
		long l=k;
		System.out.println(dd);
		System.out.println(ii);
		System.out.println(ff);
		System.out.println(l);
		
		
		
		

	}

}
