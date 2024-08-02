package inheritance;

public class Findareas {
	public static void main(String arg[]) {
		Figure f=new Figure(10,20);
		Rectangle r=new Rectangle(3,5);
		Triangle t=new Triangle(10,8);
		
		 Figure figref;
		 figref = r;
		 System.out.println("Area is " + figref.area());
		 figref = t;
		 System.out.println("Area is " + figref.area());
		 figref = f;
		 System.out.println("Area is " + figref.area());
		
	}

}
