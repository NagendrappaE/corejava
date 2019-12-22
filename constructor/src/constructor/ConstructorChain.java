package constructor;

public class ConstructorChain {

	public ConstructorChain() {
	 this(6);
		System.out.println("inside the  default constructor");
		
	}
	
	public ConstructorChain(int x) {
		
		this(6,7);

		System.out.println("inside the parameterized constructor X::::::"+x);
	}
	
	
	public ConstructorChain(int x,int y) {
		
		int z=x*y;
		System.out.println("inside the two  parameter constructor X and Y:::"+z);
		
	}
public static void main(String[] args) {
	
	
	System.out.println("inside the main  method");
	
	//ConstructorChain  c1=new ConstructorChain();
	
	ConstructorChain c2=new ConstructorChain(8);
}	
}
