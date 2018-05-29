package section3;


//inheritance implementation from parent class of Bankaccount to child class of CPAaccount

public class CPAaccount extends Bankaccount implements IRate{
	
	private String interestrate;
	
	
	public String getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(String interestrate) {
		this.interestrate = interestrate;
	}
   
	public void showInfo() {
		
		// gettter and setter can be accessed from any where in the project since they are public. 
		System.out.println("Name: "+ getName() + " And : "+ getSSN());
	}

	void compound() {
		System.out.println("the derived  compound interest will be : "+ interestrate);
	}
	

}
