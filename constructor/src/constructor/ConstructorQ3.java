package constructor;

public class ConstructorQ3 {

	public static int a=10;
	
	public ConstructorQ3() {
	a=23;
	
	System.out.println("the value of the constructor::"+a);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		System.out.println("********************8");
		System.out.println("the before  "+a);

		ConstructorQ3 q3=new ConstructorQ3();
		
		System.out.println("the "+a);
	}
}
