package shape;

public abstract class shape2d implements shape {
	double area;
	public void area() 
	{
		System.out.print("Area: "+area+"\n");
		return;
	}
	public void properties()
	{
		area();
	}
}

