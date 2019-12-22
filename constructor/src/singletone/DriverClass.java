package singletone;

public class DriverClass {

	public static void main(String[] args) {
		
		System.out.println("inside the main  class");
		
		SingleToneTest s1=SingleToneTest.getMyInstanceNoarg();
		
		s1.val=s1.val+34;
		s1.name="nagebbbbb";
		System.out.println(" the zero argument constructors the  values:::::"+s1.val);
		

		SingleToneTest s2=SingleToneTest.getMyInstance("nagendrappa");
		
		
		
		
	}
}
