package constructor;
/*
 * https://www.geeksforgeeks.org/java-arrays-question-5/
 */
public class ConstructorQ1 {

	public int val1,val2;
	
	public ConstructorQ1(int v1,int v2) {
		// TODO Auto-generated constructor stub
		
		this.val1=v1;
		
		this.val2=v2;
		System.out.println("inside the  paramterized constructor::::::");
	}
	
	public static void main(String[] args) {
		System.out.println("inside the main methos");
		
		//ConstructorQ1 q1=new ConstructorQ1(); // if we create construcytor thn java will not craete default constructor
	
		ConstructorQ1 q1=new ConstructorQ1(2,3);
	}
	
}
