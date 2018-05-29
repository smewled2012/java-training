package labs;

public class Student {
	// define all the atrributs and variable 
	
	private	static int id=1000;
	private String name;
	private String phonenumber;
	private String city;
	private String state;
	private String SSN;
	private String email;
	private String Userid;
	private static final int coursefee =800;
	private String courses = "";
	private int balance=0;
	
	
	public Student(String name, String SSN) {
		this.SSN = SSN;
		this.name = name;
		id++;
		createEmailid();
		createUserID();
		
	}


	private void createUserID() {
		// create a random number 
	    int max =9000;
		int min = 1000;
		int random = (int) (Math.random()*(max-min));
		random = random+min;
		//System.out.println(random);
		
	  Userid = id+""+ random +SSN.substring(6);
	  System.out.println("the user ID will be: "+ Userid);
		
	}

	
	public void createEmailid() {
		
		email= name.toLowerCase() + "."+id+""+  "@gmail.com";
		System.out.println("your email Id will be: "+ email);
		
	}
	
	public void enroll(String courses) {
		
		this.courses = this.courses + "\n" + courses;
		System.out.println(name + ", you are enrolled to "+ courses );
		balance =balance + coursefee;
		System.out.println("balance $"+ balance);
		
	}
	

   public void pay(int amount) {
	   System.out.println("you need to pay a registration fee of: "+ amount);
	   
	   balance =balance-coursefee;
	   
	  
	
    } 
   
   public void checkBalance() {
	   System.out.println("your current balance : $" + balance);
		
	}
	
	public String toString() {
		
		return "[Name: " + name+ "]\n[courses: " + courses+ " ]\n[Balance: $" + balance +  "]\n[State: "+state + "]";
		
	}
	
	public void showCourses() {
		
		System.out.println("The courses registered are :" +courses);
		
		
	}



	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
