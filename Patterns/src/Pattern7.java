import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
 		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
    		for(int i=1;i<=n;i++)
    		{
			 int k=i;
        		for(int j=1;j<=i;j++,k++)
        		{ 		
            			System.out.print((char)(k+65));
        		} 
        		System.out.println("");
    		}
	}

}
