package task2;

public class Rectangle {
	private int length;
	private int width;
	
	Rectangle(side)
	{
		length=side;
		width=side;
	}

	Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
	}

	void getDetails()
	{
		System.out.println("Area of the Rectangle:" +  length*width);
	}

}
