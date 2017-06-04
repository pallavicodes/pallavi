package pack1;

public class Demo2 {


	byte bMin=Byte.MIN_VALUE;
	byte b;
	byte bMax=Byte.MAX_VALUE;
	int iMin=Integer.MIN_VALUE;
	int i;
	int iMax=Integer.MAX_VALUE;
	short sMin=Short.MIN_VALUE;
	short s;
	short sMax=Short.MAX_VALUE;
	long lMin=Long.MIN_VALUE;
	long l;
	long lMax=Long.MAX_VALUE;
	public void project1(){

System.out.println("byte range is:" +bMin+"  "+b+"   "+bMax);
System.out.println("integer range is" +iMin+"   "+i+"  "+iMax);
System.out.println("short range is" +sMin+"  "+s+"  "+sMax);
System.out.println("long range is" +lMin+"  "+l+"  "+lMax);


	}
	public static void main(String[] args) {
Demo2 d=new Demo2();
d.project1();
	}

}
