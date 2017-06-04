package polymorphism;

public class Overriding2 extends Overriding1{

	public void m1(int a,int b){
		System.out.println("a+b="+(a+b));
	}
	public static void main(String[] args) {
		new Overriding1().m1(30,40);
		new Overriding2().m1(50, 60);
	}
}
