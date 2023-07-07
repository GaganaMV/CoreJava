package oops;

public class StudentEx {
	int rno=1;
	String name="Anu";
	
	void display() {
		System.out.println("Student rno: " +rno);
		System.out.println("Student name: " +name);
		
	}

	public static void main(String[] args) {
		
		StudentEx s=new StudentEx();
		s.rno=9;
		s.name="Gagana";
		s.display();
		
		StudentEx s1=new StudentEx();
		s1.rno=19;
		s1.name="Geetha";
		s1.display();
      
		StudentEx s2=new StudentEx();//default constructor
        s2.display();
	}

}
