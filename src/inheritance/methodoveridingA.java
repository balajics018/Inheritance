package inheritance;

public class methodoveridingA {
	int i,j;
	methodoveridingA(int a,int b){
		i=a;
		j=b;
	}
	void show(){
		System.out.println("i andj:"+i +" "+j);
	}			
	}
class B extends methodoveridingA{
	int k;
	B(int a,int b,int c){
		super(a,b);
		k=c;
	}
	void show() {
		System.out.println("k:"+k);
	}
}

	


