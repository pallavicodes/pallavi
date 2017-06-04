package parameterized_nonparameterized;

public class Student_list {
	static final String colgname="SIT";
	static public void info(int regd,String name,String city){
		System.out.println("std information: " +regd+"  "+name+"  "+city+"  "+colgname);
		
	}
	public static void main(String[] args) {
		info(123,"pallavi","angul");
		info(124,"xyd","ghi");
	}

}
