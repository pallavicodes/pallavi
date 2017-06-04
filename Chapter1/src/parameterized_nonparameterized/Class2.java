package parameterized_nonparameterized;


public class Class2 {
	int a=2,b=4;
			
	
	
	public void m1(){
		System.out.println(a+b);
	}
	public void m2(int a,int b ){
		System.out.println(a+b);
	}
	
	public void m3(byte b, short s){
		System.out.println(b+s);
	}
	public void m4(byte b){
		System.out.println(b);
	}
	public void m5(short s){
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		Class2 c=new Class2();
		//new Class2().m3(1, 2);
		c.m4((byte)1111);
		c.m5((short)787788);
		/*new Class2().m1();
		new Class2().m2(30,3);*/
		//new Class1().m1(30, 2);
		
		
		
	}

}
