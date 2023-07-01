package basic;

public class ternaryopeator {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		int c=8;
		int result;
		result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("Maximum of 3 no: "+result);
	}

}
