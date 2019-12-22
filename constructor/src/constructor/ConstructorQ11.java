package constructor;

public class ConstructorQ11 {

	
	private String name;
	
	private int k=23;
	
	public static void main(String[] args) {
		
		
		System.out.println("inside the main method");
		System.out.println(" the  value before calling constru::::::");
		ConstructorQ11 q11=new ConstructorQ11();
		
		System.out.println(" the value"+q11.k);
	}
}
