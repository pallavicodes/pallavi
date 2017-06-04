package class_called_another_class;

public class A {
  static int i=345;
  byte b=67;
 public void m1(){
	 System.out.println();
 }
 public static void main(String[] args) {
	System.out.println("b+i="+(new A().b+i));
	
}
}
/*output:-
b+i=412*/