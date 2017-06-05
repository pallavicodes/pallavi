package multiple;

public class Class implements Multiple_3 {

	public void m1() {
		System.out.println("i am the parent \n");
	}

	public void m2() {
		System.out.println("i am also a parent \n");
		
	}

	
	public void m3() {
		System.out.println("i am the child of multiple_1 and multiple_2 \n");
	}
	
public static void main(String[] args) {
	Class d=new Class();
	d.m1();
	d.m2();
	d.m3();
}
}
