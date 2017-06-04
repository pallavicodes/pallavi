package pack1;

public class Demo4 {
 int c=30,e=40;
public void prject3(){
	int a=300,b=50;//though we declare a,b in class level we declare again in method level so when we call the variables it will take the local variables only
	System.out.println(+(a+b));
}

	public static void main(String[] args) {
Demo4 d=new Demo4();
d.prject3();

	}

}
