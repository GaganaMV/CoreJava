package basic;
class Student{
    static int fee;
	static String name="Gagana";
}


public class staticex {

	public static void main(String[] args) {
		Student.fee=1000;
		System.out.println("fee :"+Student.fee);
		Student.name="Sindhu";
		System.out.println("Name : "+Student.name);
		

	}

}
