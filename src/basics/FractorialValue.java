package basics;

public class FractorialValue {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println(fact(i));
			i++;
		}

	}
	
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		else if (n == 1) {
			return 1;
		}
		return fact(n-1) * n;
	}

}
