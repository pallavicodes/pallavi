package parameterized_nonparameterized;

public class Class1 {
	
	public void m1(int a,int b){//parameterized method
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a-b);
		System.out.println();
	}
		
	
	public static void main(String[] args) {
		new Class1().m1(1,3);
		new Class1().m1(4, 6);
		new Class1().m1(6, 7);
		new Class1().m1(9, 7);
	}

}
