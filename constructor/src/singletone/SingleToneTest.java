package singletone;

/*
 * https://www.geeksforgeeks.org/private-constructors-and-singleton-classes-in-java/
 */
public class SingleToneTest {

	private static SingleToneTest inst = null;
	public String name;

	public int val=20;

	private SingleToneTest() {

		System.out.println("inside the singletone consttructor");
	}

	private SingleToneTest(String  dob) {

		System.out.println("inside the singletone argument  consttructor"+dob);
	}


	
	public static SingleToneTest getMyInstanceNoarg() {

		if (inst == null) {
			inst = new SingleToneTest();

		}
		return inst;

	}
	//useless class
	public static SingleToneTest getMyInstance(String  str) {

		
		if (inst == null) {
			inst = new SingleToneTest(str);

		}
		return inst;

	}
}
