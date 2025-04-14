package in.programs.reversenumber;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Reverse {
	public static void main(String[] args) {
		final Logger log=Logger.getLogger("in.programs.ReverseNumber.Reverse");
		int num=1234;
		log.log(Level.INFO,"{0}",num);
		int rev=0;
		rev=reverse(num,rev);
		
		log.log(Level.INFO,"${0}",rev);
	}
	
	public static int reverse(int num,int rev) {
		if(num==0) {
		 return rev;
		}
			
		return reverse(num/10,rev*10+num%10);
	}
	
}
