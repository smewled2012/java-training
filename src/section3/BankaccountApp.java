package section3;

// this is the function that the user access and we will do all other functions and encapsulations and all other functions inside classes on which the user won't have access 

public class BankaccountApp {
	// this client must access only what they need 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a bank count 
		
		//think instantiation an object 
		
		// the routing number of all bank accounts are similar so we want simplify it by defining it once 
		
		
		//the two objects are created with the same name with polymorphisim overloading 
		Bankaccount acc1 = new Bankaccount();
		//acc1.accountnumber = "023698741";
		
		Bankaccount acc2 = new Bankaccount("Wells Fargo ...");
		
		
		//editing name as like as possible which isn't good 
		// with Encapsulation we can access the variable through public method  here the client doen't know what is going on inside setname and get name functions.
		// Encapsulation is public API method ...it is hidden just give us the name and we will do what we wanna do 
	//	acc1.name= "Bob herry ";
		acc1.setName("Bob seme");	
		System.out.println("Name of encapsulated is : " + acc1.getName());	
		acc1.setSSN("012365");
		System.out.println("the social security will be: " + acc1.getSSN());
		
		acc1.setAccountnumber("2369852");
		System.out.println("the account number : "+ acc1.getAccountnumber());
		
	//	acc1.setRate();
	//	acc1.increaseRate();
		
		
		
		

		
		// now we learn how to access the child class CPAaccount  inherited from parent class Bankaccount
		// inheritance 
		/*
		 * CPAaccount cpa1 = new CPAaccount();
		
		cpa1.setInterestrate("4.5%");
		cpa1.setName("Semeneh Derived1");
		System.out.println("Please display the name: " + cpa1.getName());
		cpa1.setSSN("00036987");
		cpa1.showInfo();
		cpa1.compound();
		
		*/

	
	}

}
