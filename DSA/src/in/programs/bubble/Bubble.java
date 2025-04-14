package in.programs.bubble;


import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bubble {
	private static Logger logger=Logger.getLogger("in.programs.bubble.Bubble");
	public static void main(String[] args) {
		int[] a= {31,5,7,45,60,4};
		logger.log(Level.INFO,"{0}",Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			boolean bs=true;
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]<a[j+1]) {
					bs=false;
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
				}
			}if(bs) break;
		}

		logger.log(Level.INFO,"{0}",Arrays.toString(a));
	}

}
