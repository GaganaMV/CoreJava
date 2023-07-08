package oops;

import oops.PublicEx;

public class PublicAccessEx {

	public static void main(String[] args) {
		PublicEx s1 = new PublicEx(10);
		s1.s="Gagana";
		System.out.println(s1.s);
		s1.display();
	}

}
