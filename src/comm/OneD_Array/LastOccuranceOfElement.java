package comm.OneD_Array;
//Find last occurrence of Element if not return -1
public class LastOccuranceOfElement {
	
	public static int lastOccurance(int a[], int ele) {
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				c=i;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		
		int a[]=Array.readArray();
		int c=lastOccurance(a, 2);
		System.out.println(c);
		
	}
}
