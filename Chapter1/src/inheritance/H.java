package inheritance;

public class H extends F {
	int e=3,r=5;
	public void m5(){
		System.out.println(h+e);
	}
	public void m6(){
		System.out.println(b-r);
	}
	public static void m7(){
		System.out.println(new H().e+new F().i);
	}
	public static void main(String[] args) {
		new F().m1();
		F.m2();
		new H().m5();
		new H().m6();
		m7();
	}
	

}
