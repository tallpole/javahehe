package basics;

public class MaxAveMin {
	public static void main(String[] args) {
		
	
		
		int[] arrNum = {1,1,1,1,1,11,3};
		
		System.out.println(Average(arrNum));
	}
	// function to sumup all the items in the array
	
	
	//function return the maximum
	
	public static int MaxNum(int[] pre) {
		
		int temp = pre[0];
		for (int i = 0; i < pre.length; i++) {
			if (temp <=pre[i] ) {
				temp = pre[i];	
			}
		}
		return temp;
	}
	
	//return the average
	public static int Average(int[] pre) {
		
		int temp = pre[0];
		for (int i = 1; i <pre.length; i++) {
			temp = temp + pre[i];
		}
		return temp / pre.length;
	}
	
	
	
	
	//return the minimum
	
	public static int MinNum(int[] pre) {
		
		int temp = pre[0];
		for (int i = 0; i < pre.length; i++) {
			if (temp >=pre[i] ) {
				temp = pre[i];	
			}
		}
		return temp;
	}
	
	

}
