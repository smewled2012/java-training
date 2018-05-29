package section3;

public class Accountapp {

	public static void main(String[] args) {
		LoanAccount la1 = new LoanAccount();
		la1.increaseRate();
		la1.setRate();
		la1.setTerm(9);
		la1.setAmmort();
		
		//polymorphism cause it is changing where it is changing using different object 
	//	IRate account1= new LoanAccount();		
		
		Bankaccount account2 = new Bankaccount();
		CPAaccount account3 = new CPAaccount();
		
		CPAaccount acc3 = account3;
		//error cause acc3 of bankaccount can't access the methods of child cpaaccount 
		// this is polymorphism on which the method access depends on the variable that defines the new object
		account3.compound();
		acc3.compound();

	}

}
