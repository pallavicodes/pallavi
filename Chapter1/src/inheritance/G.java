package inheritance;

public class G extends F{
	int d=8;
	short v=4;
	int i=45;
	
	public void m3(){
		System.out.println(new F().i+4);
		System.out.println(d+v);
		
	}
	public static void m4(){
		//new F().m1();
		//m2();
		new G().m3();
	}
	
	public static void main(String[] args) {
		m4();
	}
}

