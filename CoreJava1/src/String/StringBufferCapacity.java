package String;

public class StringBufferCapacity {

	public static void main(String[] args) {
		// StringBuffer buffer = new StringBuffer();
		// create a StringBuilder object
	        // with a String passed as parameter
	        StringBuilder str
	            = new StringBuilder("WelcomeGeeks");
	 
	        // get capacity
	        int capacity = str.capacity();
	 
	        // print the result
	        System.out.println("StringBuilder = " + str);
	        System.out.println("Capacity of StringBuilder = "
	                           + capacity);
	}

}
