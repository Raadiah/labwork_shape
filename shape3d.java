package shape;

public abstract class shape3d implements shape {
	double volume;
	public void volume() 
	{
		System.out.print("Area: "+volume+"\n");
		return;
	}
	public void properties()
	{
		volume();
	}
};
