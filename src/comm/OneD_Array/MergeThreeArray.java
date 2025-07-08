package comm.OneD_Array;

public class MergeThreeArray {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,28};
		int b[]= {50,60,70,80,90};
		int c[]={100,200};
		
		int d[]= new int [a.length+b.length+c.length];
		
		for(int i=0;i<d.length;i++)
		{
			if(i<a.length)
			{
				d[i]=a[i];
			}else if(i<(a.length+b.length)) {
				d[i]=b[i-a.length];
			}else
			{
				d[i]=c[i-a.length-b.length];
			}
		}
		
		Array.displayArray(d);
	}
}
