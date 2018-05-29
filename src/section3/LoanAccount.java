package section3;

public class LoanAccount implements IRate {
	
	public void setRate() {
		System.out.println("RATE :");
		
	}
   
	public void increaseRate() {
		System.out.println("Increase Rate ");
		
	}
	
	public void setTerm(int term) {
		System.out.println("setting the terms to: "+ term +"years ");
	}
	public void setAmmort() {
		System.out.println("Ammortization Schedule ");
	}
}
