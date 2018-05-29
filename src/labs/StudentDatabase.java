package labs;

public class StudentDatabase {

	public static void main(String[] args) {
		
		Student std1 = new Student("Semeneh", "0123654798");
		std1.setPhonenumber("+13013647156");
		//System.out.println("Your phone number: "+ std1.getPhonenumber());
		std1.setCity("Hyatsville");
		//System.out.println("your City : "+ std1.getCity());
		std1.setState("Maryland");
		//System.out.println("Your State : "+ std1.getState());
		
		std1.enroll("maths101");
		std1.enroll("Management");
		std1.pay(500);   
		System.out.println(std1.toString());		
		std1.showCourses();
		 std1.checkBalance();
		Student std2 = new Student("LISAN", "1234560008");
		std2.setPhonenumber("+13259687895");
		std2.setCity("Falls-Church");
		std2.setState("Viriginia");
		std2.enroll("Eng526");
		System.out.println(std2.toString());
		

	}

}

