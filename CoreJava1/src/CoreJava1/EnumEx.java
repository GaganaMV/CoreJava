package CoreJava1;

public enum EnumEx {
	Winter(0), Summer(1), Mansoon(2);
	private int index;
	
	private EnumEx(int index) {
		this.index=index;
	}
	public static void main(String[] args) {
		System.out.println("EnumEx.Mansoon.index");
	}
		
	
	
	
}
