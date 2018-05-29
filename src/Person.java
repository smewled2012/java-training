
class Table{
	// this class cantains data and methods 
	
	//methods to avoid redundancy 
	public Table() {
		//public Table(10);
		
		System.out.println("This is the first Constructor !");
	}
	
	public Table(int age) {
		System.out.println("Second Constructor !");
	}
	
	public Table(String name, int age) {
		
		System.out.println("Third constructor "+ name + " is " + age + " years old !");
	}
	
	private String name;
	private int age;
	
	public void setName(String name1)  {
		name = name1; 
		
	}
	public void setAge(int age1) {
		age = age1;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	void mergeAge () {
		//int loveMe(int age);
		
		System.out.println("The name of the table " + name + " and is "+ age + " years old !" );
	
	}
	
	
}

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table table1 = new Table();
		Table table2 = new Table(5);
		Table table3= new Table("semeneh ", 6);
	//	table1.name= "Laptop table";
	//	table1.age = 2;
		//table1.mergeAge();
		table1.getAge();
		table1.getName();
		table1.setName("Laptop name");  	
		// setter is used to encapsulate the variables and data's declared inside the class 
		table1.setAge(5);
	//	table1.mergeAge();
		
		
		
		
		
		
		

	}

}
