import java.util.Scanner;
public class haha {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	int n = input.nextInt();
	PrintN(n);
	}
	public static void PrintN(int N){
       if (N >0){
    	   System.out.println(N);   
    	   PrintN(N-1);
       }
   }
}