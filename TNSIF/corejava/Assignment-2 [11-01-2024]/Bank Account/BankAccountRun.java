package task3;

public class BankAccountRun {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(135796429);
		b1.getDetails();
		
		BankAccount b2 = new BankAccount(246876543,"Sai");
		b2.getDetails();
		
		BankAccount b3 = new BankAccount(143765986,"Priya",1000);
		b3.getDetails();
		}
}
