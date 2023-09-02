package bittu;



import org.junit.Test;


public class demo extends Util {
	
	public int age = 30;
	

	@SuppressWarnings("deprecation")
	@Test
	public void test1() {
		//Selenium code
		chromePath();
		launch();
		login();
		closeBrowser();	
		greeting();
		
		//object creation
		Pack pc = new Pack();
		pc.bittuMethod();
		
		//overloading
		pc.overload1();
		pc.overload1(2);
		pc.overload1("Anup");
		
		//overriding
		demo d = new demo();
		d.overriding1();
		Util ut = new Util();
		ut.overriding1();
		
		//Static methods
		Pack.staticMethod1();
		System.out.println(Pack.name);
		
		//Super and this keyword me farak
		System.out.println("parent age"+super.age);
		System.out.println("current age"+this.age);
	}
	
	
	public void overriding1() {
		System.out.println("ye child ka overriding method hai");
	}
	


}
