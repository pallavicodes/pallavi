package pack1;

public class Dmo1 {
	byte b;
	int i;
	short s;
	long l;
	float f;
	char c;
	boolean bool;
public void project(){
	System.out.println("default value of byte is:"+b);
	System.out.println("default value of int is:"+i);
	System.out.println("default value of short is:"+s);
	System.out.println("default value of long is:"+l);
	System.out.println("default value of float is:"+f);
	System.out.println("default value of char is:"+c);
	System.out.println("default value of boolean is:"+bool);
}
	public static void main(String[] args) {
Dmo1 d=new Dmo1();
d.project();

	}

}
