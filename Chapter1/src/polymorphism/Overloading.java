package polymorphism;

public class Overloading  {
	public int a=23;
	public int b=34;
	
   public void m1(){
	   System.out.println("a+b="+(a+b));
   }
   public void m1(int c,int d){
	   System.out.println(+(c+d));
   }
   public static void main(String[] args) {
	 new  Overloading().m1();
	 new Overloading().m1(20, 40);
}
}
