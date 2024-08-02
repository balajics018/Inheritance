package inheritance;

public class Absarea {
public static void main(String args[]) {
	//abs a =new abs(10,2,4);//
	Rect r =new Rect(3,5);
	Tri t =new Tri(6,34);
	abs absref;//
	absref=r;
	System.out.println("area is :"+absref.area());
	absref=t;
	System.out.println("area is :"+absref.area());
}
}
