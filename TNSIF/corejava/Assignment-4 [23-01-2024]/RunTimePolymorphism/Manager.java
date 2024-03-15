class Manager extends Employee
{
	private double bonus;

	public Manager(String name,double basesalary,double bonus)
	{
		super(name,basesalary);
		this.bonus=bonus;
	}

	public void calculateSalary()
	{
		System.out.println("Calculating salary for manager:" + super.name);
		double salary=super.basesalary + bonus;
		System.out.println("Base salary:" + super.basesalary);
		System.out.println("Bonus:" + bonus);
		System.out.println("Total salary:" + salary);
	}
}
