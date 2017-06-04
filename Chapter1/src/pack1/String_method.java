package pack1;

public class String_method {
	String name="Hello world";
	String name1="hello world";
	String name3="  My name is";
	String name4="   hi";
	String name5="i am pallavi";
	String name6="my account no is #987555";
	 
public void m2(){
	System.out.println(name);
	System.out.println(name.length());//length starts from 1
	System.out.println(name.toLowerCase());//the output will be in small letter
	System.out.println(name.toUpperCase());
	System.out.println(name.charAt(6));//it will show the  value  index value  of the letter
	System.out.println(name.replace("Hello", "Goodmorning"));//it will replace the value of the sub-string  
	System.out.println(name.substring(6,10));//i have to pass the index number which letter i wnt to show
	System.out.println(name.equals(name1));//equals shows two string are same or not..its shows the true or false
    System.out.println(name.equalsIgnoreCase(name1));//it ignores the case
    System.out.println(name4);
    System.out.println(name4.trim());//it will clear the space if have any 
    System.out.println(name1.concat(name3));//it will combined two strings
    System.out.println(name5.contains("pallavi"));//it will give true or false statement whether the word u given it contains in the string or not 
    System.out.println();
    


}
public static void main(String[] args) {
	new String_method().m2();
}
}
