class Programmer extends Employee 
{
	private double overtimepay;

	public Programmer(String name,double basesalary,double overtimepay)
	{
		super(name,basesalary);
		this.overtimepay=overtimepay;
	}

	public void calculateSalary()
	{
		System.out.println("Calculating salary for Programmer:" + super.name);
		double salary=super.basesalary + overtimepay;
		System.out.println("Base salary:" + super.basesalary);
		System.out.println("Overtimepay:" + overtimepay);
		System.out.println("Total salary:" + salary);
	}
}
