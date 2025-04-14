package in.programs.mergesort;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DivideConquir {
	private static Logger log=Logger.getLogger("in.programs.mergesort.DivideConquir");
	public static void main(String[] args) {
		int[] arr= {90,50,10,60,80,20,40,70,30};
		log.log(Level.INFO,"{0}",Arrays.toString(arr));
		
		divid(arr,0,arr.length-1);
		log.log(Level.INFO,"{0}",Arrays.toString(arr));
		
	}
	public static void divid(int[] arr,int l,int h) {
		if(l<h) {
			int m=(l+h)/2;
			divid(arr,l,m);
			divid(arr,m+1,h);
			conquire(arr,l,m,h);
		}
	}
	public static void conquire(int[] arr,int l,int m,int h) {
		int n1=m-l+1;
		int n2=h-m;
		int[] left=new int[n1];
		int[] right=new int[n2];
		
		for(int i=0;i<n1;++i) {
			left[i]=arr[l+i];
		}
		for(int j=0;j<n2;++j) {
			right[j]=arr[m+1+j];
		}
		
		int i;
		int j;
		int k;
		i=j=0;k=l;
		while(i<n1&&j<n2) {
			if(left[i]<right[j]) {
				arr[k]=right[j];j++;
			}else {
				arr[k]=left[i];i++;				
			}k++;
		}
		while(i<n1) {
			arr[k]=left[i];i++;k++;
		}
		while(j<n2) {
			arr[k]=right[j];j++;k++;
		}
		
	}
}