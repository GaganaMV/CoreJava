package oops;

public class StuentEx1 {

		int rno;
		String name;
		
		public  StudentEx1() {
			rno=15;
			name="Gopal";	
		}
		
		public StudentEx1(int rno,String nm) {
			this.rno=rno;
			name=nm;
		}
		
		public StudentEx1(String nm) {
			rno=34;
			name=nm;
		}
		
		//copy Constructor
		public StudentEx1(StudentEx1 s) {
			rno=s.rno;
			name=s.name;
		}
		void display() {
			System.out.println("Student Rollno: "+rno);
			System.out.println("Student Name: "+name);	
		}
		
		
		public static void main(String[] args) {
			StudentEx1 s3=new StudentEx1(17,"pujitha");//parameterized
			s3.display();
			StudentEx1 s=new StudentEx1();//object
			s.rno=1;
			s.name="Pooja";
			s.display();
			StudentEx1 s1=new StudentEx1();
			s1.rno=10;
			s1.name="Priya";
			s1.display();
			StudentEx1 s2=new StudentEx1();//default
			s2.display();
			StudentEx1 s4=new StudentEx1("Jiya");
			s4.display();
			StudentEx1 s5=new StudentEx1(s);
			s5.display();

		}

	}

}
