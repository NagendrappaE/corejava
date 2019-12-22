package constructor;

public class ConstructorQ2 {

	private int i=20;
	
	public ConstructorQ2() {
	
		i=400;
		System.out.println("inside the default constructor::::::");
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		ConstructorQ2 q2=new ConstructorQ2();
		
		
		System.out.println("the value "+q2.i);
	}
}
