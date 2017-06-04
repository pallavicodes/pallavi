package non_static_class_called_in_another_class;

public class Execution_class {
	
	
	static class3 c=new class3();
	
	
public static void main(String[] args) {
	
	
	System.out.println("i am Execution_class \n");
	
	System.out.println("i am having all class");
	
	c.m3();
	
}
			

}
/*output:-
i am Execution_class 

i am having all class
i  am class3
i am havig class1 and class2 

i am class2
i am in class3
i am having class1 

i am class1
i am in class2 
*/

