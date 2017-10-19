package shape;

public class main {
		public static void main(String[] args)
		{
			Rectangle ABCD=new Rectangle();
			ABCD.set_length(3);
			ABCD.set_width(4);
			ABCD.properties();
			Right_Triangle ABC=new Right_Triangle();
			ABC.set_base(5);
			ABC.set_height(3);
			ABC.properties();
			Square PQRS=new Square();
			PQRS.set_length(3)
			PQRS.properties();
			sphere OABC=new sphere();
			OABC.set_radius(7);
			OABC.properties();
			cube my_cube=new cube();
			my_cube.set_length(8);
			my_cube.properties();
		}
}
