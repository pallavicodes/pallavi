package inheritance;


public class F {
	
    byte i=7;
	byte b=5;
	int h=9;
	public void m1(){
		System.out.println(i+b);
	}
	public static void m2(){
    System.out.println(new F().i*new F().b);
	}
public static void main(String[] args) {
	new F().m1();
	m2();
}
}
