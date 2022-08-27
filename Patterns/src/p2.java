import java.util.Scanner;
import java.math.*;
public class p2 {

		public	static int max_number(int n) {
			
				 int maxnumber = 0;
			        int i=1;
			        while(n/i>0){
			            int newnumber=(n/(i*10))*i+n%i;
			            i=i*10;
			            if(maxnumber<newnumber)
			            {
			                maxnumber=newnumber;
			            }
			                
			            }
			            return maxnumber;
			}
		}
