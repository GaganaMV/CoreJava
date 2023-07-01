package basic;

public class wideing {

	public static void main(String[] args) {
		byte b=10;
		System.out.println("Byte :"+b);
		char ch='G';
        System.out.println("Character :"+ch);
		String s="hello";
		System.out.println("String :"+s);
		int i=10000;
		System.out.println("Integer :"+i);
		//wideing
		float f11=i;
		System.out.println("float widening :"+f11);
		byte b1=(byte)i;
		System.out.println("narrowing :"+b1);
		float per=89.99f;
		System.out.println("Float :"+per);
		double d=678.890;
		System.out.println("Double :"+d);
		short s1=345;
		System.out.println("Short:"+s1);
		boolean bol=true;
		System.out.println("Boolean:"+bol);
	}
	}

}
