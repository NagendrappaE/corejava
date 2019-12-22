package InstantBlocks;

public class InstantBlockMultiple {

	{
		System.out.println("first");
		
	}
	public InstantBlockMultiple() {
		// TODO Auto-generated constructor stub
		System.out.println("inside the default constructor");
	}
	
	{
		System.out.println("second");
	}
	{
		System.out.println("third");
	}
	public InstantBlockMultiple(String nm){
		System.out.println("parameterized constructor" +nm);
	}
	public static void main(String[] args) {
		
		System.out.println("main  method started");
		
		InstantBlockMultiple m1=new InstantBlockMultiple();
		
		
	}
}
