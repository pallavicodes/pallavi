package pack1;

public class Demo9 {
static int i=345;
byte b=4;
public void m1(){
	System.out.println(b);
}
public static void m2(){
	Demo9 d=new Demo9();
	d.m1();
System.out.println(i);	
}
public static void main(String[] args) {
	m2();
}
}
