class Thing{
	public final static int Lucky_number=56;
	// if you use final it is final value so that i can't update the value 
	public String name;
	public static String description;
	
	public static int count = 0;
	
	public int id;
	
	public Thing() {
		
		id = count;
		count++;
	}
	
	
	
	
	
	public void showName() {
		System.out.println("the object Id " + id +" "+  name + " "+ description);
		
	}
	public static void showInfo() {
		System.out.println(description);
		// can't work cause non static variable can't have access System.out.println(name);
	}
	
	
}
public class App {
	public static void main(String [] args) {
		
		
		Thing.description="I am static thing";
		Thing.showInfo();
		
		System.out.println("before an object is created " + Thing.count);
		
		Thing thing1 =new Thing();
		Thing thing2 =new Thing();
		
		System.out.println("After creating an object : "+ Thing.count);
		
		thing1.name= "seme";
		thing2.name= "bebe";
		
		thing1.showName();
		thing2.showName();
		System.out.println(Math.PI);
		System.out.println(Thing.Lucky_number);
		
		
		
	}

}
