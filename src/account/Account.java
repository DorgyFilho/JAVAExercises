package account;

public class Account {
	
	//Default Value TAX
	public static final double TAX = 5.00;
	
	//Object Members
	private String AccNumber;
	private String AccHolder;
	private double InitialDep;
	private double Deposit;
	private double WithDraw;
	private double Balance;
	
	//Constructor
	
	public Account(String AccNumber, String AccHolder, double InitialDep, double Deposit, double WithDraw, double Balance) {
		this.AccNumber = AccNumber;
		this.AccHolder = AccHolder;
		this.InitialDep = InitialDep;
		this.Deposit = Deposit;
		this.WithDraw = WithDraw;
		this.Balance = Balance;
	}	
	public Account(String accNumber, String accHolder, double initialDep) {
		super();
		this.AccNumber = accNumber;
		this.AccHolder = accHolder;
		this.InitialDep = initialDep;
	}
	//Getters and Setters - Constructor
	
	public String getAccNumber() {
		return AccNumber;
	}
	
	public static double getTax() {
		return TAX;
	}
	public String getAccHolder() {
		return AccHolder;
	}
	public void setAccHolder(String accHolder) {
		this.AccHolder = accHolder;
	}
	public double getInitialDep() {
		return InitialDep;
	}
	public void setInitialDep(double initialDep) {
		this.InitialDep = initialDep;
	}
	public double getDeposit() {
		return Deposit;
	}
	public void setDeposit(double deposit) {
		this.Deposit = deposit;
	}
	public double getWithDraw() {
		return WithDraw;
	}
	public void setWithDraw(double withDraw) {
		this.WithDraw = withDraw;
	}
	
	public void setBalance(double Balance) {
		this.Balance = Balance;
	}
	public double getBalance() {
		return Balance;
	}
	
	//Operations
	public double InDeposit() {
		 return Balance + InitialDep;
	}
	
	public void newDeposit(double Deposit) {
		Balance = Balance + Deposit;
	}
	
	public void WtDraw(double WithDraw) {
		Balance = (Balance - WithDraw) - TAX;
	}
	
	public String toString() {
		return "Account: " + AccNumber 
				+  " Name: " + AccHolder
				+ " Balance: $ " + String.format("%.2f", InDeposit());
	}
	
	
	

}
