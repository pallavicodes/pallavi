package encapsulation;

public class C {
      public void m3(){
    	  //System.out.println("a+d="+(new A().a+new A().b));here b will not work because b is a private property of A
    	  System.out.println("a+d="+(new A().a+new A().d));
      }
      public static void main(String[] args) {
		new C().m3();
		
		
	}
}
