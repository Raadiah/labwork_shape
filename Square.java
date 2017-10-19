package shape;

public class Square extends Quadrilateral{
	double length;
	public void area()
	{
		area=length*length;
		System.out.print("Area: "+area+"\n"); 
	}

	public void set_length(double x)
	{
		length=x;
	}
}