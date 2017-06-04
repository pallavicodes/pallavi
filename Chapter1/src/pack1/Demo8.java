package pack1;

public class Demo8 {
static byte b=3;
short s=5666;
int i=456;
static long l=9000;
public void m1(){
	System.out.println(s);
	System.out.println(i);
	System.out.println(b);
}
public static void m2(){
System.out.println(l);
	System.out.println(b);
}
public void m3(){
	m1();
	m2();
}
	public static void main(String[] args) {
		Demo8 d=new Demo8();
		d.m3();
	}

}
