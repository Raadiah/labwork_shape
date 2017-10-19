package shape;

public class Rectangle extends Quadrilateral{
	double length;
	double width;
	 
	public void area()
	{
		area=length*width;
		System.out.print("Area: "+area+"\n"); 
	}
 	public void set_length(double x)
	{
		length=x;
	}
 	public void set_width(double x)
	{
		width=x;
	}
}
