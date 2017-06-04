package pack1;

public class Demo12 {
	int a=100;
	static short s;
	static 	Demo12 obj1=new Demo12(); 
	public void m111()
	{
		System.out.println(a+s);
	}
	public static void main(String[] args) {
        obj1.m111();
		obj1.a=200;
		s=300;
		
	System.out.println(s+obj1.a);
	}
}
