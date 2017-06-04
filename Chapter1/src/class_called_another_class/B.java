package class_called_another_class;

public class B {
	
int u=345;
	public void m2(){
		
		System.out.println(("i+u=")+( A.i+u));
		System.out.println(new A().b+u);
	}
	
	public static void main(String[] args) {
		System.out.println("i+u="+(A.i*new B().u));
	}

}
/*output:-
i+u=119025*/