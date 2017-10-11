package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("456782100", 1000.3);
		BankAccount acc2 = new BankAccount("838877583", 2020);
		BankAccount acc3 = new BankAccount("848727282",3394);
		acc1.makeDeposit(1000.2);
		acc1.accure();
	 	System.out.println(acc1.toString());

	}

}

class BankAccount implements IInterest {
	//Properties of bank account
	private static int iD = 1000;				// Internal iD
	private String accountNumber; //iD + random 2-digit number + first 2 of the SSN
	private static final String routingNumber = "0094858393";
	private String name;
	private String SSN;
	private double balance;
	// Constructors
	public BankAccount(String SSN, double initdeposit) {
		balance = initdeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	private void setAccountNumber() {
		int random = (int) (Math.random()*100);

		accountNumber = iD + ""+ random  + SSN.substring(0,2);
		System.out.println("Your Account Nubmer: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	
	public void setBalance(double balance) {
		this.balance= balance;
	}
	public double getBalance() {
		return balance;
	}
	public void showBalance() {
		System.out.println("Your Balance is: "+this.balance);
	}
	public void makeDeposit(double amount) {
		balance = balance + amount;
		this.showBalance();
		
	}
	
	public double paybill(double amount) {
		balance = balance - amount;
		return balance;
	}
	
	
	@Override
	public void accure() {
		// TODO Auto-generated method stub
		balance = balance * (1+ rate/100);
		showBalance();
	}
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber+ "]\n" + "[Balance: " + balance + "]";
		
	}
	
}