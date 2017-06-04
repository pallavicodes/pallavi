package inheritance;

public class I extends G {
	 int i;
	int f=5;
public static void m8(){
	System.out.println(new F().b+new I().f);
}
public void m9(){
	System.out.println(new F().i);
	System.out.println(new F().i+new I().i);
	System.out.println(new F().h+new G().d);
}
public static void main(String[] args) {
	//System.out.println(i+F.i);
	new I().m9();
}

}

