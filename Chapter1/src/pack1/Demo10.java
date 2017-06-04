package pack1;

public class Demo10 {
	int i=3456;
	static byte b=45;
	public static void m2(){
		
		
		Demo10 c=new Demo10();
		
		System.out.println(c.i);//we can't call non static variable directly to static method.it only can be possible if we create a object.
		
		System.out.println(b);
	}
	public static void main(String[] args) {
		m2();
	}

}
