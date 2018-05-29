package section3;

// we are performing an object oriented programming which is a 

class person{
	String name;
	String email;
	String phone;
	
	void walk (){
		System.out.println(name + " is Walking .......");
		
	}
	void eat (){
		System.out.println(name + " is Eating..........");
		
	}
	void sleep(){
		System.out.println(name + " is sleeping .........");
		
	}
}

public class object1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// instantiate an object 
		person person1= new person();
		// define the properties or atribute 
		person1.name= "semeneh";
		person1.email= "smewled@gmail.com";
		person1.phone ="3013647156";
		
		// abstraction where we only wanted if the person is walking/ not we didnt care abt the detail 
		person1.walk();
		person1.eat();
		person1.sleep();
		
		person person2 =new person();
		person2.name = "sara";
		
		person2.sleep();
				
		

	}

}
