package signup;

public class cadFunc {
	private Integer id;
	private String Name;
	private double Salary;
	
	public cadFunc() {
	}

	public cadFunc(Integer id, String Name, double Salary) {
		this.id = id;
		this.Name = Name;
		this.Salary = Salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(Double Salary) {
		this.Salary = Salary;
	}
	
	public void incSalary(double perc) {
		Salary += (Salary * perc) / 100.0;
	}
	
	public String toString() {
		return id + ", " 
				+ Name + ", "
				+ String.format("%.2f", Salary);
	}

}
