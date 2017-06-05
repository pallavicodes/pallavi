
package hybrid;

public class Class implements Hybrid_2,Hybrid_3{

	public void m1() {
		System.out.println("i am parent");
		System.out.println("i have two children");
		System.out.println();
		
	}
	public void m2() {
		System.out.println("i am child 1");
		System.out.println();
	}

	public void m3() {
		System.out.println("i am child 2");
			}
	public static void main(String[] args) {
		Class a=new Class();
		a.m1();
		a.m2();
		a.m3();
	}


}
