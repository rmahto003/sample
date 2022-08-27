import java.util.Scanner;
public class Pattern10 {
	
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		//int i = 1
//		while (i <=n) {
//			int j = 1;
//			while (j <= n-i+1) {
//				System.out.print("*");
//				
//				j = j + 1;
//			}
//			System.out.println("");
//			i = i +1;
//		}
		
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
			System.out.print(i);
			}
			System.out.println();
			for(int k=5; k>=i; k--) {
			System.out.print("");
			}
			}
		
	}
}
