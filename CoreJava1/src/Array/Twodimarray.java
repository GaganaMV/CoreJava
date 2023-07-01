package Array;

public class Twodimarray {

	public static void main(String[] args) {
		int a[][] = { { 1, 2 }, { 3, 4 } };
		System.out.println("a[0][0] :" + a[0][0]);
		System.out.println("a[0][1] :" + a[0][1]);
		System.out.println("a[1][0] :" + a[1][0]);
		System.out.println("a[1][1] :" + a[1][1]);
		
		for(int i=0;i<2;i++) {
		    for(int j=0;j<2;j++) {
				System.out.println(a[i][j]);
			}
		}
	}
	

}
