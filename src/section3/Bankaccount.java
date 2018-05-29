package section3;

public class Bankaccount implements IRate {
// what is gone contain a bank account 
	// define variables on top
	
	 String accountnumber;
	private static final String routingnumber = "01236"; // belongs to class not a particular object instance 
	// this is only accessed by the class and can't be changed 
	// final are like constants 
	
	// instant variables 
	private String name;
	private String SSN;
	String accountType;
	double balance = 0;
	
	// constructor definitions 
	// used to define or setup initialize properties of an object 
	// 2. implicitly called instantiation 
	// 3. the same name as a the class itself 
	// 4. have no return type at all 
	
	public Bankaccount() {
		System.out.println("New Account created  !");
	}
	
	//polymorphism through  overloading calling the same method name with different parameter or argument
	public Bankaccount(String name){
		System.out.println("the Second account in " + name);
		
		
	}
	Bankaccount(String name, int initial  ){
		//msg initials and name all are local variables 
		System.out.println("this is the second bank account of " + name +" with initial deposit of " + initial);
		String msg = null;
		if(initial>1000) {
			msg= " Thank you for trusting us by saving " + initial;
		}
		else {
			msg= "Sorry you can't use this bank cause you have less money ";
		}
		System.out.println(msg);
		balance = balance+initial;
	}
	
	// we will access the private variables through setter and getter on which it will be defined 
	public void setName(String name) {
		this.name= "Mr. " +name;
	}
	public String getName() {
		return name;
	}
	 
	public void setSSN(String SSN) {
		this.SSN= " social security "+ SSN;
	}
	public String getSSN() {
		return SSN;
	}
	
	//interface methods 
	
	public void setRate() {
		System.out.println("the interface rate will be:");
	}
	
	public void increaseRate() {
		System.out.println("the incremented rate of the interface:");
	}
	
	
	
	//public method available anywhere , private method is only accessed inside that class default and protected and then public 
	
	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	// this is private and it can only called from within the class 
	private void showActivity(String activity) {
		System.out.println("your recent activities of bank account : " + activity);
		System.out.println("your Current Balance is  " + balance);
		
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		//System.out.println("you deposited  " + amount);
		showActivity("Deposit ");
		
		
	}
	
	void withdraw(double amount) {
		balance = balance -amount;
		//System.out.println("You withdraw " + amount);
		showActivity("Withdraw ");
	}
	
	void checkBalance() {
		System.out.println("your account balance is : "+ balance);
		
	}
	
	void getStatus() {
		
	}
	
	@Override 
	
	// routing number used in the program without knowing it but as a developer wwe knew we had it in the background 
	// this is encapsulation mostly we use public , private and protected 
	//make your mathod as restrictive as possible and expose them as less as possible and when it is neccessary.
	public String toString() {
		return "[ NAME: " + name + " Account number:  "+ accountnumber + " RountingNumber : " + routingnumber + " Balance $"+ balance +" ]";
	}
}
