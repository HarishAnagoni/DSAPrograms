package in.programs.selection;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Selection {
	private static Logger logger=Logger.getLogger("in.programs.selection.Selection");
	public static void main(String[] args) {
		int[] a= {5,9,11,15,3,2};
		logger.log(Level.INFO,"{0}",Arrays.toString(a));
		for(int i=0;i<a.length-1;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		logger.log(Level.INFO,"{0}",Arrays.toString(a));
	}
}
