package task5;

public class Student {
	private int id;
	private String name;
	private int age;
	
	Student(int id)
	{
		this.id=id;		
	}
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	void getDetails()
	{
		System.out.println("***Details of the Student***");
		System.out.println("Student ID:" + id);
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		
	}

}
