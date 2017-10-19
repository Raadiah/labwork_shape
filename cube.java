package shape;

public class cube extends shape3d {
	
	double length;
 
	public void volume()
	{
	 volume= (length*length*length);
	 System.out.print("Area: "+volume+"\n");
	}
	public void set_length(double x)
	{
		length=x;
	}
	
}
