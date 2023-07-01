package Array;

public class cloneex2 {

	public static void main(String[] args) {
		int b[][] = {{1,2,3,4,5},{6,7,8,9,10}};
		int cloneb[][] = b.clone();	
		System.out.print(b[0] == cloneb[0]);
		System.out.print(b[1] == cloneb[1]);
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				
		 System.out.print("=>" +b[i][j]);
			}
		}
		for(int i=0;i<cloneb.length;i++) {
			for(int j=0;j<b.length;j++)
			
			
		System.out.print(">=" + cloneb[i][j] + " ");
	}
	}
}
