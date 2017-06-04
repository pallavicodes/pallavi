package loops;



public class Else_if {

	public void m1(int a,int b){
		if(a<b){
			System.out.println("a+b="+(a+b));
		}
		else if(a>b){
			System.out.println("a-b="+(a-b));
		}
		else if(a==b){
			System.out.println("a*b="+(a*b));
		}
		else if(a!=b){
			System.out.println("a/b="+(a/b));
		}
		else{
			System.out.println("a,b"+a+b);
		}
		}
	public static void main(String[] args) {
		new Else_if().m1(10, 20);
	}
	}