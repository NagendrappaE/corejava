package InstantBlocks;

public class StaticBlock {

	static int a=m1();

	public static int m1() {
		// TODO Auto-generated method stub
		
		System.out.println("inside the method m1  ");
		return 22;
	}
	static {
		System.out.println("inside the static block");
		
	}
	
	public static void main(String[] args) {
		System.out.println("inside the main method");
		
		System.out.println(" the output ::::"+a);
	}
}
