import java.util.Scanner;

public class Pattern9 {

	public static void main(String[]args){
//		Scanner s =new Scanner(System.in);
//		int n = s.nextInt();
//
//		int i =1;
//		while(i<=n){
//
//			int spaces = 1;
//			while(spaces <= n-i){
//				System.out.print("");
//				spaces = spaces + 1;
//
//			}
//			int stars = 1;
//			while (stars<=i){
//
//				System.out.print("*");
//				stars = stars+1;
//			}
//			System.out.println();
//			i=i+1;
//
//		}
		
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		for (int i= 1; i<= n; i++)  
		{  
		for (int j=1; j<=n-i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (int k=1;k<=i;k++)  
		{  
		System.out.print(k);  
		}   
		System.out.println("");  
		}  
		
		
	}
}
