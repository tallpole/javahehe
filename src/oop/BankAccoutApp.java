package oop;

public class BankAccoutApp {

	public static void main(String[] args) {
		//creating a new account >> think instantiate an object
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "052717940";
		acc1.setName("Hang Su");
		System.out.println(acc1.getName());
		//With Encapsulation : public API methods

		
		acc1.balance = 10000;
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		//Polymorphism through overriding
		System.out.println(acc1.toString());
		
		
		//Polymorphism through overloading
		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "052717940";
		
		
		BankAccount acc3 = new BankAccount("Saving Acccount", 13400.05);
		acc3.accountNumber = "052717940";
		
		/*
		acc3.checkBalance();
		
		//Demo for inheritance
		CDaccount cd1 = new CDaccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Hank";
		cd1.accountType = "CD Account";
 		System.out.println(cd1.toString());
 		cd1.compount();
		*/
	}
	

}
