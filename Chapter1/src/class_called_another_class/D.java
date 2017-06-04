package class_called_another_class;

public class D {
 int h=2345;
static short s=456; 
     public void m3(){
    	 System.out.println(("h+s=")+(h+s));
     }
     public static  void m4(){
    	 System.out.println(("h-s=")+(new D().h-s));
    	 //C.m2();
     }
     public static void main(String[] args) {
		 C.m2();
		 D.m4();
		 new D().m3();
	}
}
