package encapsulation;

public class B extends A {
       public void m2(){
    	   System.out.println("c="+c);
       }
       public static void main(String[] args) {
		new B().m2();
	}
}
