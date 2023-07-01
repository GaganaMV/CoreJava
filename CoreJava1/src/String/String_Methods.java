package String;

public class String_Methods {

	public static void main(String[] args) {
		String str = "Black bunny";
		String str1 = "Pink";
		String str2 = "Red";
		System.out.println("Length of String :"+ str.length());
		System.out.println("To Uppercase :"+ str.toUpperCase());
		System.out.println("TO LowerCase :"+ str.toLowerCase());
		System.out.println("Equals :"+ str.equals(str1));
		System.out.println("Equal Ignore :"+ str.equalsIgnoreCase(str1));
		System.out.println("Concat :"+ str.concat(str1));
		System.out.println(str.compareTo(str1)); 
		System.out.println("compare to Ignore Case :"+ str.compareToIgnoreCase(str1));
		System.out.println(str.contains("a"));
		System.out.println("Index of c :"+ str.indexOf("c"));
		System.out.println("Index of a :"+ str.indexOf("a"));
		System.out.println("Index of b :"+ str.indexOf("b"));
		System.out.println("Index of B :"+ str.indexOf("B"));
		System.out.println(" LastIndex of a :"+ str.lastIndexOf("a"));
		System.out.println("Replace String :"+ str1.replace("Pink","Red"));
		System.out.println("Substring :"+ str.substring(3, 4));
		System.out.println("Trim :"+ str.trim());
		String str3 = str2.trim();
		String str4 = "How are you?";
		String arrStr[] = str4.split(" ", 3);
		System.out.println("Splited Elements:");
		for(int i=0;i<arrStr.length;i++) {
			System.out.print(arrStr[i] + " ");
		}
		System.out.println();
		System.out.println("Splited Elements using for each loop:");
			for (String str5 : arrStr) {
				System.out.print(str5 + " ");
				System.out.println();
			}
		String str6="";
		System.out.println("Is String is empty : " +str6.isEmpty());
		System.out.println("Is String is Blank : " +str6.isBlank());
		//single dimensional array using enhanced for loop
		//declaring an array  
		   int arr[]={12,13,14,44};  
		   //traversing the array with for-each loop  
		   for(int i:arr){  
		     System.out.println(i);  
		   }
}
}
