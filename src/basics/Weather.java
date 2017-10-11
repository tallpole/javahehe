package basics;

public class Weather {
	public static void main(String[] args) {
		// This program will give suggestion what to wear based on the weather (tempreture)
		int temperature = 81;
		String sunCondition = "Overcast";
		
		if(temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and t-shirt");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler, Wear long-sleeve shirt and jeans. ");
			System.out.println("Wear a hat to block the sun. ");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day, make sure to wear warmer clothes!");
			
		}
		else {
			System.out.println("Looks like a cold day, bring a sweater. ");
		}
		
	}

}
