package shape;

public class Right_Triangle extends Triangle{
	double base;
	double height;
	 
	public void area()
	{
	 area= (0.5*base*height);	
	 System.out.print("Area: "+area+"\n");
	}
	public void set_base(double x)
	{
		base=x;
	}
	public void set_height(double x)
	{
		height=x;
	}

}
