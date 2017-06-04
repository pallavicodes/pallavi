
package class_called_another_class;

public class C {

	int i=4546;
	static short u=456;
	public void m1(){
		System.out.println(i+u);
	}
	
	 public static void m2(){
		 System.out.println(new C().i*u);
		 new C().m1();
	 }
//	 public static void main(String[] args) {
//		m2();
//	}
}
