package pac2;

public class Chapter5 {
	
	int a=100;
	static int b=200;
	
	public static void m(){
		Chapter5 c=new Chapter5();
		System.out.println(c.a);
		System.out.println(b);
		System.out.println(("a+b=")+(c.a+b));
	}
	public static void main(String[] args) {
		m();
	}

}
