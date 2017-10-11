package basics;

public class Cities {

	public static void main(String[] args) {
		// declare and an array
		String[] cities = {
				"New York", "San Francisco", "Miami", "Dallas"
		};
	
		// Declare & define the array
		String[] states = new String[5];
		states[0] = "New York";
		states[1] = "California";
		states[2] = "Ohio";
		states[3] = "Utah";
		states[4] = "Texas";
		//Declare array
		String[] countries = new String[9];
		//Define the array
		countries[0] = "USA";
		countries[1] = "China";
		countries[2] = "Japan";
		countries[3] = "Germany";
		countries[4] = "Russia";
		countries[5] = "Korea";
		//declare an int array
		int[] numAA = new int[5];
		numAA[0] = 0;
		numAA[1] = 1;
		numAA[2] = 2;
		numAA[3] = 3;
		numAA[4] = 4;
		System.out.println("*************");
		
		int i = 0;
		//Do loop: enters the loop THEN test condition
		do {
			System.out.println(numAA[i]);
			i = i + 1;
		} while (i <5);
		//While loop: tests condition first then enters loops
		int n = 0;
		while (n < 5) {
			System.out.println(countries[n]);
			n++;
		};
		//For loop: best structure for iterating through an array
		for (int x = 0; x<5; x++) {
			System.out.println(states[x]);
		}
		
	}
}
