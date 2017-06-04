package packStringExm;

public class B {
	
	String name="Hello Java x";
	String city1="hyderabad";
	String city2="Hyderabad";
	String str="    Hello";
	String str1="How are ";
	String str2="  you";
	String trasactionId="Product Trasaction Id@989877@Hello";
	public void m2(){
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(6));
		System.out.println(name.replace("Java", " lmn "));
		System.out.println(name.substring(0));
		System.out.println(name.substring(0, 5));
		System.out.println(name.substring(6,10));
		System.out.println(city1.equals(city2));
		System.out.println(city1.equalsIgnoreCase(city2));
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println(city1.compareTo(city2));
		System.out.println(str1);
		System.out.println(str1.concat(str2));
		System.out.println(str.contains("Hello"));
		String[] x=trasactionId.split("@");
		/*System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		*/for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}

		
	}
	public static void main(String[] args) {
		new B().m2();
	}

}
