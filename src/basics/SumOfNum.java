package basics;

public class SumOfNum {

	public static void main(String[] args) {
		
		int f = 0;
		while (f < 100) {
			System.out.println(SumNum(f));
			f++;			
		}
			}
	public static int SumNum(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return SumNum(n-1) + n;
	}
		
}
