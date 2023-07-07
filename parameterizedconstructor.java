package oops;

public class parameterizedconstructor {

		int rno;
		String name;
		
		public parameterizedconstructor () {
			rno=1;
		    name="Anu";
		}
		
		public parameterizedconstructor(int rno,String nm) {
			this.rno=rno;
			name=nm;
		}
		
		public parameterizedconstructor(String nm) {
			rno=10;
			name=nm;
		}
		
		
		void display() {
			System.out.println("Student rno: " +rno);
			System.out.println("Student name: " +name);
			
		}

		public static void main(String[] args) {
			
			parameterizedconstructor s=new parameterizedconstructor();
			s.rno=9;
			s.name="Gagana";
			s.display();
			
			parameterizedconstructor s1=new parameterizedconstructor();
			s1.rno=19;
			s1.name="Geetha";
			s1.display();
	      
			parameterizedconstructor s2=new parameterizedconstructor();//default constructor
	        s2.display();
	        
	        parameterizedconstructor s3=new parameterizedconstructor(4,"Bindu");//paramerterized constructor
	        s3.display();
	        
	        parameterizedconstructor s4=new parameterizedconstructor("hindu");//parameterized constructor
	        s4.display();
		}

	}
