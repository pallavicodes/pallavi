package encapsulation;

public class A {
     public int a=45;
     private int b=5;
     protected char c='n';
     int d=60;
     
     public void m1(){
    	 System.out.println("a+b="+(a+b));
    	 System.out.println("b+d="+(b+d));
     }
     public static void main(String[] args) {
		new A().m1();
	}
}
