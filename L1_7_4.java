import java.util.Scanner;

public class L1_7_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}		
		
		System.out.print(maxSubseqSum4(a));
	}
	
	public static int maxSubseqSum4(int a[]){
		int thisSum = 0,maxSum =0;
		for (int i = 0; i < a.length; i++) {
			thisSum += a[i];
			if (thisSum > maxSum) {
				maxSum = thisSum;
			}
			else if(thisSum < 0){
				thisSum = 0;
			}
		}
		return maxSum;
	}

}
