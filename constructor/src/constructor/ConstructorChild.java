package constructor;

public class ConstructorChild extends ConstructorBase {

	
	public ConstructorChild( ) {
		//super();
		
		super("nagendta");
		System.out.println("inside the default constructor CHILD");
	}
	
	public static void main(String[] args) {
		System.out.println("inside the Main  class stRTE");
		
		ConstructorChild c1=new ConstructorChild();
	}
}
