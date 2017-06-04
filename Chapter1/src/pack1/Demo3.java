package pack1;

public class Demo3 {
	int i=100,s=400;//if we declare variables in class level it is called global or instance or concrete or non static variables)
	public void project2(){
		int f=400;//(if we declare variables in method level it is called local variable)
		System.out.println(+(i+s));
		System.out.println(+(i-s));
	System.out.println(+f);
	}

	public static void main(String[] args) {
Demo3 d=new Demo3();
d.project2();

	}

}
