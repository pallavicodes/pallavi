package hierarchy;

public class Class_hierarchy implements Hierarchy_4{
	
	public void m1() {
	
	System.out.println("i am a parent having two children hierarchy2 and hierarchy3 \n");
	}

	public void m2() {
		System.out.println("i am child 1 of parent heirarchy1");
		System.out.println("i am a parent of hierarchy4 \n");
	}

	public void m3() {
        System.out.println("i am child 2  of parent heirarchy1");
        System.out.println("i am parent of hierarchy4 \n");
	    
	 }
	
	public void m4() {
		System.out.println("i am child of both hierarchy 2 and hierarchy3 \n");
	}
	
	public static void main(String[] args) {
		Class_hierarchy e=new Class_hierarchy();
		e.m1();
		e.m2();
		e.m3();
		e.m4();
        System.out.println("i have each and evry interface property");
	}
}
/*output:-
i am a parent having two children hierarchy2 and hierarchy3

i am child 1 of parent heirarchy1
i am a parent of hierarchy4

i am child 2  of parent heirarchy1
i am parent of hierarchy4

i am child of both hierarchy 2 and hierarchy3
i have each and evry interface property*/

