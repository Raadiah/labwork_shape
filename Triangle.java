package shape;

public abstract class Triangle extends shape2d {
	double area;
	public void area(int x, int y) 
	{	
		area=0.5*x*y;
		System.out.print("Area: "+area+"\n");
	}
};
