package InstantBlocks;

public class InstantBlockTest {

	private String nm=null;
	//first instant blocks
	{
		
		System.out.println("first block");
	}
	public InstantBlockTest()
	{
		
		System.out.println("inside the  default constructor");
	}
	public InstantBlockTest(String name) {
		
		this.nm=name;
		System.out.println("inside the parameterized constructor the NAME "+this.nm);
		
	}
	
	
	public static void main(String[] args) {
		
		/*
		 *  order of execution 
		 *  1.Static blocks---only once
		 *  2.instant block--as many time as object created
		 *  3. constructor
		 */
		System.out.println("the  main method");
		InstantBlockTest ins=new InstantBlockTest();
		
		InstantBlockTest in1=new InstantBlockTest("bbbbb");

		
		
	}
}
