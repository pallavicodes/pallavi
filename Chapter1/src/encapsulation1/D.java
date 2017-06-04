package encapsulation1;

import encapsulation.A;

public class D extends A{
public void m1(){
	System.out.println("a ="+a);
}
public static void main(String[] args) {
	new D().m1();
}
}
