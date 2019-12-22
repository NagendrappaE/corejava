package constructor;

public class ConstructorBase {

	public ConstructorBase() {

		this("");

		System.out.println("inside the default constructor  BASE ");
	}

	public ConstructorBase(String name) {

		System.out.println("inside the parameter  constructor  BASE  NAME" + name);
	}

	public String ConstructorBase(String name) {

		System.out.println("inside the parameter  Method  BASE  NAME" + name);

		return name;

	}

}
