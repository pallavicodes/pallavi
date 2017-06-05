package multilevel;

public class Class2 implements M_level1,M_level2,M_level3{
	
	int e=25;
  
	public void m1() {
		
		System.out.println("i am grand parent interface");
		System.err.println("i have variable:b"+" "+b);
		System.out.println();
		
	}
	

	public void m2() {
		
		System.out.println("i am parent interface");
		System.out.println("i have my own variable:c"+" "+c);
		System.out.println("b+c="+(b+c));
		System.out.println();
	}


	public void m3() {
		
		System.out.println("i am child interface");
		System.out.println("i have my own variable:d"+" "+d);
		System.out.println(("c+d=")+(c+d)+" "+"(b+c+d)="+(b+c+d));
		System.out.println();
	}

	public void m4(){
		
		System.out.println("i have properties of each and every interface property");
		System.out.println();
		System.out.println(+b+" "+(b+c)+" "+(b+c+d)+" "+(b+c+d+e));
	}
	
	
public static void main(String[] args) {
	new Class2().m1();
	new Class2().m2();
	new Class2().m3();
	new Class2().m4();
}	
	

}

/*output:-i am grand parent interface have variable:b 5


i am parent interface
i have my own variable:c 45
b+c=50

i am child interface
i have my own variable:d 100
c+d=145 (b+c+d)=150

i have properties of each and every interface property

5 50 150 175

*/