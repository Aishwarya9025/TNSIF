package task3;

public class BankAccount {
	private double accountno;
	private String name;
	private double balance;
	
	BankAccount(double accountno)
	{
		this.accountno=accountno;
	}
	
	BankAccount(double accountno,String name)
	{
		this.accountno=accountno;
		this.name=name;
	}
	
	BankAccount(double accountno,String name,double balance)
	{
		this.accountno=accountno;
		this.name=name;
		this.balance=balance;
	}
		
	void getDetails()
	{
		System.out.println("***Account Details***");
		System.out.println("Account NO:" + accountno);
		System.out.println("Name:" + name);
		System.out.println("Balance:" + balance);
			
	}
}
