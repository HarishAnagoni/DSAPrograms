package in.programs.stdarymerge;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TwoAryMerge {
	private static Logger logger=Logger.getLogger("in.programs.stdarymerge.TwoAryMerge");
	public static void main(String[] args) {
		int[] a= {1,2,13,34,65};
		int[] b= {26,37,48,109,210};
		int[] c=new int[a.length+b.length];
		logger.log(Level.INFO,"{0}",Arrays.toString(a));
		logger.log(Level.INFO,"{0}",Arrays.toString(b));
		int i;
		int j;
		int k;
		i=j=k=0;
		while(i<a.length&&j<b.length) {
			if(a[i]>b[j]) {
				c[k]=b[j];j++;
			}else {
				c[k]=a[i];i++;
			}
			k++;
		}
		while(i<a.length) {
			c[k]=a[i];i++;k++;
		}

		while(j<b.length) {
			c[k]=b[j];j++;k++;
		}
		logger.log(Level.INFO,"{0}",Arrays.toString(c));
	}
}
