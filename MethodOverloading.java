package oops;

public class MethodOverloading {


		MethodOverloading() {
			System.out.println("default");
			System.out.println("Introduction:");
		}
		MethodOverloading(String name) {
			System.out.println("Name: " + name);
		}
		MethodOverloading(String scname, int rollNo) {
			System.out.println("School name: " + scname + ", " + "Roll no:" + rollNo);
		}
		public static void main(String[] args) {
			MethodOverloading p1 = new MethodOverloading();
			MethodOverloading p2 = new MethodOverloading("Hanu");
			MethodOverloading p3 = new MethodOverloading("Greenfinger", 12);
		}


	}


