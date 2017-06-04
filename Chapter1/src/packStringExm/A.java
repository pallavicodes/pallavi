package packStringExm;

public class A {
	
	String name1;
	String name2="lmn";//name2 is string object
	String name3=new String("hello");
	
	public void m1(){
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
	}
	public static void main(String[] args) {
		new A().m1();
	}

}
