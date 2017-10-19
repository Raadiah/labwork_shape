package shape;

public class sphere extends shape3d {
	
	double radius;
 
	public void volume()
	{
	 volume= ((4/3)*3.14*radius*radius*radius);
	 System.out.print("Area: "+volume+"\n");
	}
 
	public void set_radius(double x)
	{
		radius=x;
	}
	
}
