package constructor;

import java.math.BigDecimal;

public class ConstructorSlave extends ConstructorMaster {

	
	private String empName;
	
	
	private BigDecimal  amount;
	
	
	public ConstructorSlave() {
	
		System.out.println("inside the default constructor SLAVE");
		
		System.out.println("the amount value "+amount);
		// TODO Auto-generated constructor stub
	}
	
}
