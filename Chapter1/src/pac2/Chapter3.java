package pac2;

public class Chapter3 {
	
	int a=10;
	static int b=20;
	
	public void m1(){
		System.out.println("i am non static m1 \n");
	}
	public static void m2(){
		System.out.println("i am static m2 \n");
	}
	public void m3(){
		m1();//non static method
		m2();//static method
		System.out.println(("a+b=")+(a+b));//a is non static variable and b is static variable
		System.out.println("i am non static m3");
	}
	

}
