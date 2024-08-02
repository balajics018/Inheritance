package inheritance;

abstract class abs {
	double dim1;
	double dim2;
	
	abs(double a,double b){
		dim1=a;
		dim2=b;
	}
	abstract double area();
}

class Rect extends abs{
	Rect(double a,double b){
		super(a,b);
	}
	double area() {
		System.out.println("Inside area of the Rectangle.");
		return dim1*dim2;
	}
	
}
class Tri extends abs{
	Tri(double a,double b){
		super(a,b);
	}
	double area() {
		System.out.println("Inside area of the Triangle.");
		return dim1*dim2/2;
	}
}

