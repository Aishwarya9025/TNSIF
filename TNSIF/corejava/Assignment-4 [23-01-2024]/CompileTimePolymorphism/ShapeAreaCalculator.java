class ShapeAreaCalculator
{
	public void CalculatorArea(int sideLength)
	{
		System.out.println("Area of the Square:" + sideLength*sideLength);
	}

	public void CalculatorArea(int length, int width)
	{
		System.out.println("Area of the Rectangle:" + length*width);
	}

	public void CalculatorArea(double radius)
	{
		System.out.println("Area of the Circle:" + 3.14*radius*radius);
	}
}
