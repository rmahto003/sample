import java.util.Scanner;
public class Pattern12 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
//
//		for(int i=1; i<=n; i++)
//		{
//			for(int k=1; k<=i; k++)
//			{
//				System.out.print(" ");
//			}
//
//			for(int j=1; j<=n; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) 
//				System.out.print(" ");
//			for (int j = 1; j <= n; j++) 
//				System.out.print("*");
//			System.out.println();
//		}
		
		
for(int i = 0; i < n; i++){
            
            //loop for 40 stars
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            
             System.out.println();
             
             //loop for spaces
             for(int l = 0; l <= i; l++){
                System.out.print(" ");//two space
            }
        }

	}

}