package constructor;

public class ConstructorInheritance {
public static void main(String[] args) {
	
	System.out.println("inside the  main method");
	
ConstructorMaster master=new ConstructorSlave();//downcast

ConstructorChild child =new  ConstructorChild(); 
	
//ConstructorChild inher=new ConstructorMaster()  //constructor inheritance not allowed

}
}
