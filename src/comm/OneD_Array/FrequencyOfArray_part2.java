package comm.OneD_Array;
/* frequency of array using int array
-> max value from array a
-> create 2nd array of length max+1
-> loop array a and instalize array b 
-> 
 */
public class FrequencyOfArray_part2 {
	public static void main(String[] args) {
	
		int a[]= {4,3,7,8,6,3,-7,2,1,-7,0,0,0};
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
			 if (a[i] >= 0) {
			    b[a[i]]++;
			 }
		}
		Array.displayArray(b);

		for(int i=0;i<b.length;i++)
		{
			if(b[i]>0)
			{
				System.out.println(i+"====>"+b[i]+"times");
			}
		}
		
	}
}
