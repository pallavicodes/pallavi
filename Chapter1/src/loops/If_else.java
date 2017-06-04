package loops;

public class If_else {
	
	
	public void m1(int a,int b){
		if(a>b){
			System.out.println("a-b="+(a-b));
		}
		else{
			System.out.println("a+b="+(a+b));
		}
	}
	public static void main(String[] args) {
		new If_else().m1(20,30);
	}
}
