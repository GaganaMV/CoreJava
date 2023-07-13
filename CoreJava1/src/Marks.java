package Exception;

import java.util.Scanner;

public class Marks {
	  
	static void validateMarks(int marks1)
	{
		if( marks1<0 && marks1<=100) {
			System.out.println("print marks");
		}
		else {
			throw new ArithmeticException("Invalid marks");
		}
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks =sc.nextInt();
		
		//Marks m=new Marks();
		//validateMarks(marks1);
		}

}
