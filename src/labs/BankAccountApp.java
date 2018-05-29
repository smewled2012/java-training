package labs;

public class BankAccountApp {

	public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("023694715",1000);
        BankAccount acc2 = new BankAccount("3694715",2000);
        BankAccount acc3 = new BankAccount("23694715",1500);
        
        acc1.setName("Semeneh Mewled");
        System.out.println(acc1.getName());
        acc1.makeDeposit(500);
        acc1.makeDeposit(800);
        acc1.payBill(600);
        acc1.accrue();
        System.out.println(acc1.toString());
        
        
             
        

	}
}
	
	// create a bank account class
	
	class BankAccount implements IInterest {
		//properties and variables essential in bank account creation 
	private	static int id=1001;   // internal ID st
	private	String accountnumber;  // id+random 2-digit number + first of SSN
	private	static final String routingnumber= "00236985";   // this routing number can't be changed 
	private	String name;
	private	String SSN;
	private	double balance;
	
	//constructor first 
	
	public BankAccount(String SSN, double initdeposit) {
		
	    balance = initdeposit;
		id++;	
		this.SSN = SSN;
		setAccountnumber();
	}
	
	private void setAccountnumber() {
		
		//how to generate a two digit random number 
		int random = (int) (Math.random()*100);
		
	   accountnumber = id+ ""+ random + SSN.substring(0,2);
	   System.out.println("This is your Account number: "+ accountnumber);
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		System.out.println("paying bill  "+ amount);
		balance = balance-amount;
		showBalance();
		
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making deposit "+ amount);
		balance = balance +amount;
		showBalance();
		
	}
	
	public void showBalance() {
		System.out.println("your balance is "+ balance);
	}

	@Override
	public void accrue() {
		balance = balance*(1+rate/100);
		showBalance();
		
	}
	public String toString() {
		return "[Name "+ name + "] \n[Account Number: " + accountnumber + "] \n" + "[Routing Number : "+ routingnumber + "] \n"+ "[Account Balance: "+ balance + "]";		
	}
	}


