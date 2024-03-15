class EmployeeDriver 
{
	public static void main(String[] args) 
	{
		Employee[] employees = new Employee[2];
        
        employees[0] = new Manager("Sai", 50000, 10000);
        employees[1] = new Programmer("Priya", 45000, 5000);
        
        
        employees[0].calculateSalary();
        employees[1].calculateSalary();
        
	}
}
