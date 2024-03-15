package task4;

public class Car {
	private String make;
	private String model;
	private int year;
	
	Car()
	{
		make="Audi";
		model="A4";
		year=2013;
	}
	
	Car(String model,int year)
	{
		this.make=make;
		this.model=model;
		this.year=year;
	}
	
	void getDetails()
	{
		System.out.println("***Car Details***");
		System.out.println("Model:" + model);
		System.out.println("Year:" + year);
	}
}
