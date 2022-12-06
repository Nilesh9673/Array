package comm.OneD_Array;

public class MergerArrayZigZak {
	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int b[]= {50,60,70,80,90};
		
		int []c=new int [a.length+b.length];
		
		int j=0;
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
				c[j]=a[i];
				j++;
			}
			if(i<b.length)
			{
				c[j]=b[i];
				j++;
			}
		}
		Array.displayArray(c);
	}
}
