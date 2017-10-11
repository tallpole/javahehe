package basics;

public class SalaryCalculalor {
	public static void main(String[] args) {
		//let's create a variable define our career
		
		//Declare a variable
		String career;
		System.out.println("Programming is starting");
		career = "Sofeware Developer";
		System.out.println("My career is : " + career);
		
		//compute our annual salary
		int hoursPerWeek = 40;
		int WeeksPerYear = 50;
		double rate = 42.50;
		
		//rate * hoursPerWeek * WeeksPerYear
		double salary = hoursPerWeek * WeeksPerYear * rate;
		System.out.println("My annual salary as a " + career + "is " + salary);
		
		
	}

}
