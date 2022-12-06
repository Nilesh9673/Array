package comm.OneD_Array;

public class SelectionSortAlgorithem {
	public static void main(String[] args) {
		
		int a[]= {40,30,90,100,20,10,2,4,50};
		
		for(int i=0;i<a.length-1;i++)
		{
			int m=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[m]>a[j])
				{
					m=j;
				}
			}
			if(m!=i)
			{
				int temp=a[i];
				a[i]=a[m];
				a[m]=temp;
			}
		}
		
		Array.displayArray(a);
	}
}
