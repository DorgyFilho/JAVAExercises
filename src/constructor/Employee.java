package constructor;

public class Employee {
	public String name;
	public double GrossSalary;
	public double taxes;
	
	public double LiqSalary() {
		return GrossSalary - taxes;		
	}
	
	public void incSalary(double percIncrease) {
		GrossSalary += (percIncrease/100)*GrossSalary;
	}
	
	public String toString() {
		return name 
				+ ", $ "
				+ String.format("%.2f", LiqSalary());
	}

}
