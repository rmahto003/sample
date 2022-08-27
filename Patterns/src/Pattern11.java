import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for (int m = 1; m <= n; m++)
		{
		for (int i=n; i>m; i--)
		{
		System.out.print(" ");
		}
		for (int p=1; p<=(m * 2) -1; p++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
		
		
		
		
		
		
}

}
