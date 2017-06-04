package pac2;

public class Chapter4 {
	
	public void m1(){
		System.out.println("i am non static m1 \n");
	}
	public static void m2(){
		System.out.println("i am static m2 \n");
	}
	public static void m3(){
		//m1();//non static method
		m2();//static method
		System.out.println("i am  static m3 \n");
	}

}
