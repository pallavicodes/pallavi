package abstr;

public class Main extends Person1{
	
	int a=10;
	public void emp(int c,int d){
		System.out.println("he is eligible for car loan");
		
	}
public static void main(String[] args) {
Person1 a=new Main();
	a.pl();
	a.pl(34,43);
	
	new Person2().cL();
	new Person2().pl(34, 'v');
	
}
public void pl() {

	System.out.println("eligible for loan \n");
	
}
}
