package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		//Fibonacci number is defined by the sum of the two previous fibonacci numbers
		//fib(0) = 0
		//fib(1) = 1
		//fib(2) = fib(1) + fib(0) = 1 + 0 = 1;
		//fib(3) = fib(2) + fib(1) = 1 + 1 = 2;
		//fib(4) = fib(3) + fib(2) = 2 + 1 = 3;
		//fib(5) = fib(4) + fib(3) = 3 + 2 = 5;
//		int i = 0;
//		while (i < 100) { System.out.println(fib(i));
//		i++
//			
	int x = 0;
	while (x <50) {
		System.out.println(x + " "+ fib(x));
		x++;
	}
	
	};
		
		public static int fib(int n) {
			if (n == 0) {
				return 0;
			}
			else if (n ==1) {
				return 1;
			}
			return (fib(n-1) + fib(n-2));
		}
			
	}


