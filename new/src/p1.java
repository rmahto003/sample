import java.util.Scanner;  
public class p1 {
	public static void func(int n)
	{
	    int sum=0;
	    for(int i=1;i<n;i++)
	        {
	            for(;i<n*n;i++)
	            {
	                sum+=i;
	            }
	        }
	    System.out.println(sum);
	}
    }

