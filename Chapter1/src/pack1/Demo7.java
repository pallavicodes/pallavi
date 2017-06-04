package pack1;

public class Demo7 {
static char c='f';
int i=40;
static short sh=1234;
long l=3456;
 static String s="pallavi";
public void project1(){
	System.out.println(c);//why  i am getting 102 if i am writing +c
	System.out.println(s);
}
public void project2(){
	int t=789;
	System.out.println(+t);
}
public void project3(){
project1();
project2();
System.out.println(i);
System.out.println(i+l);
System.out.println(l);
System.out.println(s);
}
	public static void main(String[] args) {
		Demo7 d=new Demo7();
		d.project3();
	}
}
