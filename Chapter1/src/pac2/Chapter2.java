package pac2;

public class Chapter2 {
	
	public void m1(){
		System.out.println("i am m1 \n");
	}
	public void m2(){
		m1();
		System.out.println("i am m2 \n");
	}
	
	public static void main(String[] args) {
		Chapter2 c=new Chapter2();
		c.m1();
		c.m2();
	}

}
