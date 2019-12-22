package InstantBlocks;

public class StaticBlockTest {

	
	static{
		
		System.out.println("STATIC FIRST");
	}
	

	static{
		
		System.out.println("STATIC SECOND");
	}
	
	public StaticBlockTest() {
	
		System.out.println("inside the default constructor ............");
		// TODO Auto-generated constructor stub
	}
	{
		System.out.println("INSTANT ONE");
		
	}
	public static void main(String[] args) {
		System.out.println("inside the main method first ::::::::::::::::::");
		
		StaticBlockTest t1=new StaticBlockTest();
		System.out.println("inside the main method 2nd ::::::::::::");
		
		StaticBlockTest t2=new StaticBlockTest();

		
		
		
	}
	
	
}
