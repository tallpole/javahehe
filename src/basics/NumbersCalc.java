package basics;

public class NumbersCalc {
	public static void main(String[] args) {
		printName();
		int numA = 10;
		int numB = 20;
		
		addNumbers(numA, numB);
		System.out.println(multiplyNumbers(numA, numB));
	}
	static void printName() {
		System.out.println("My name is HangSu");
	}
	
	static void addNumbers(int numberA, int numberB) {
		//This function will add two numbers
		int sum = numberA + numberB;
		System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
		
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		return product;
	}

}
