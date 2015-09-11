import java.util.Scanner;

public class L1_7_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}		
		
		System.out.print(maxSubseqSum2(a));
	}
	
	public static int maxSubseqSum2(int a[]){
		int thisSum,maxSum = 0;
		for (int i = 0; i < a.length; i++) {
			thisSum = 0;
			for (int j = i; j < a.length; j++) {
				thisSum += a[j];
			if (thisSum  > maxSum) {
				maxSum = thisSum;
			}
			}
		}
		return maxSum;
	}

}