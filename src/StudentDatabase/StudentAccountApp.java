package StudentDatabase;


import java.util.Random;

public class StudentAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAccount sa1 = new StudentAccount("Hank", "052717041");
		System.out.println(sa1.toString()); 
		

		
		StudentAccount sa2 = new StudentAccount("Lin", "737462817");
		System.out.println(sa2.name);
		System.out.println(sa2.SSN);
		System.out.println(sa2.Email_ID);
	}

}

class StudentAccount {
	private static int ID = 1000;
	private static final String email_suffix ="@hanksu.com";
	String name;
	String SSN;
	String Email_ID;
	String user_ID;
	
	String courses = "";
	
	private String phone;
	private String city;
	private String state;
	
	double balance = 0.0;
	
	// constructor
	public StudentAccount(String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		Email_ID = name + this.ID + this.email_suffix;
		ID++;
		
	}
		
	//methods
	void getUserID() {
		
		Random rand = new Random();
		String id4 = String.format("%04d", rand.nextInt(10000));
		user_ID = ID + id4 + SSN.substring(3);	
	}
	void enroll(double amount) {
		balance = balance + amount;	
	}
	
	void pay(double amount) {
		balance = balance - amount;	
	}
	
	double checkBalance() {
		return balance;	
	}
	
	public void setPhone(String phone) {
		this.phone= phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setCity(String city) {
		this.city = city;
		
	}
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	public String getState() {
		return state;
	}
	
	public String addCourse(String course) {
		courses = courses + "," + course;
		return courses;	
	}
	public void showCourses( ) {
		System.out.println(this.courses);
	}
	
	
	public String toString() {
		return "Name: " + name + "\n" + "Email: " + Email_ID + "\n" + "SSN: " + SSN; 
	}
//		
//	}
	
	
	
}
