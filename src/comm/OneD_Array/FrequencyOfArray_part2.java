package comm.OneD_Array;
// frequency of array using int array
public class FrequencyOfArray_part2 {
	public static void main(String[] args) {
	
		int a[]= {4,3,7,8,6,3,-7,2,1,7};
		int max=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		int b[]=new int[max+1];
		for(int i=0;i<a.length;i++)
		{
			b[a[i]]++;
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>0)
			{
				System.out.println(i+"====>"+b[i]+"times");
			}
		}
		
	}
}
