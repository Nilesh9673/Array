package comm.OneD_Array;
// find second occurrence
public class SecondOccurance {
	public static int secondOccurance(int a[], int ele) {
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				c++;
			}
			if(c==2)
			{
				return c;
			}
		}
		return -1;
	}
}
