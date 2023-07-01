package basic;

public class marks {

	public static void main(String[] args) {
		int a=80;
		int b=70;
	   String total = a>b?"pass" : "fail";
			//a>b?x:y
		System.out.println("Result : "+total);
		System.out.println("Short hand opeator: " +(a+=b));
		System.out.println("Short hand opeator: " +(a-=b));
		System.out.println("Short hand opeator: " +(a*=b));
		System.out.println("Short hand opeator: " +(a/=b));
	}

}
