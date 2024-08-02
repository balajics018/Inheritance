package inheritance;

public class Figure {
	double dim1;
	double dim2;
	
	Figure(double a,double b){
		dim1=a;
		dim2=b;
	}
	double area() {
		System.out.println("area of the figured undefined");
		return 0;
	}
}
class Rectangle extends Figure{
	Rectangle(double a,double b){
		super(a,b);
	}
	double area() {
		System.out.println("Inside area of Rectancle");
		return dim1*dim2;
	}

}
class Triangle extends Figure{
	Triangle(double a,double b){
		super(a,b);
	}
	double area() {
		System.out.println("Inside area of Triangle");
		return dim1*dim2/2;
	}
}



