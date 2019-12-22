package constructor;

/*
 * https://www.geeksforgeeks.org/constructors-not-inherited-java/
 */
public class ConstructorMaster {

	private String name;
	
	private  int num;
	
	public ConstructorMaster() {
	
		System.out.println(" the values  NUM "+num);
		System.out.println(" the values  NAME"+name);
	}
	
	public String  test(String nm,int i)
	
	{
	System.out.println("inside the method");	
	this.name=nm;
	
	this.num=i;
		return "the total string "+this.name+"/"+this.num;
	}
	
}
