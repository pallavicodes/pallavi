package non_static_class_called_in_another_class;

public class class3 {
	class2 c2=new class2();
	
	
public void m3(){
	
	System.out.println("i  am class3");
	
	System.out.println("i am havig class1 and class2 \n");
	
	c2.m2();
	
	
}
}
