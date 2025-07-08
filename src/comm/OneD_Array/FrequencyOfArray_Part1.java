package comm.OneD_Array;
// frequency of element using boolean array
// talking boolean array for frequency.
public class FrequencyOfArray_Part1 {
	public static void main(String[] args) {
		int a[]= {4,3,7,8,6,3,7,2,1,7};
		
		boolean b[]=new boolean[a.length];
			
		for(int i=0;i<a.length;i++)
		{
			if(b[i]==false)
			{
				int c=1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						c++;
						b[j]=true;
					}
				}
				
				System.out.println(a[i]+" ====> "+c+" times");
				
			}
		}
	}
}
