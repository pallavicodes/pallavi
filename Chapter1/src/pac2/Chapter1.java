package pac2;

public class Chapter1 {
	
	int a=100;
	static int b=200;
	
	public void m1(){
		 int b=10000;
		System.out.println(a);
		System.out.println(b);
	}
	public static void m2(){
		 int c=100;
		//System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Chapter1 c=new Chapter1();
		c.m1();
		m2();
	}

}
