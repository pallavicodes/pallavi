package single;

public class Class1 implements Single_1,Single_2 {
 
	public void m2() {
		
		System.out.println("i am child interface Single_2 and i have variable a");
	}

	public void m1() {
		System.out.println("i  am parent interface  Single_1 and i have variable b ");
		System.out.println();
	}


	public void  m3(){
		System.out.println("i have both parent  child interface");
		System.out.println(a+b);
	
	}
public static void main(String[] args) {
	new Class1().m1();
	new Class1().m2();
	new Class1().m3();
	
	
}
}

/*output:-
i  am parent interface  Single_1 and i have variable b 

i am child interface Single_2 and i have variable a
i have both parent  child interface
95
*/
	