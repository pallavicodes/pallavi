package non_static_class_called_in_another_class;

public class class2 {
	class1 c1=new class1();
	
public void m2(){
	System.out.println("i am class2");
	
	System.out.println("i am in class3");
	
	System.out.println("i am having class1 \n");
	
	c1.m1();

	
}
}
