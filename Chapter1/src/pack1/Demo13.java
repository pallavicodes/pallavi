package pack1;
public class Demo13 {
	String name;//string default value is null
	String name1="Hello";
	String name2=new String ("Hello world");//we are creating object for string

	public void m1(){
		System.out.println(name);

		System.out.println(name1);
	
	    System.out.println(name2);
	    }
	public static void main(String[] args) {
		new Demo13().m1();
		
	}
	}
