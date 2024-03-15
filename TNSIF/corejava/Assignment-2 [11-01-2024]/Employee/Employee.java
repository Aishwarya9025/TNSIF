package task1;

public class Employee {
	private String name;
	private int employeeid;
	private double salary;

	Employee()
	{
		name="priya";
		employeeid=456;
		salary=30000;

	}

	Employee(String name,int employeeid,double salary)
	{
		this.name=name;
		this.employeeid=employeeid;
		this.salary=salary;

	}
	
	void getDetails()
	{
		System.out.println("Name:" + name);
		System.out.println("Employee ID:" + employeeid);
		System.out.println("Salary:" + salary);
	}

}
