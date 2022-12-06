package comm.OneD_Array;

import java.util.Arrays;

//if Array contains consecutive element return 1 else return 0
public class Aptitude_Question {

	public static int consecutiveEle(int n,int a[])
	{
		
		int arr[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			arr[i]=a[i];
		}
		Arrays.sort(arr);
		n=arr[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				n++;
			}else {
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		
		int arr[] =Array.readArray();
		System.out.println(consecutiveEle(0, arr));
		
	}
	
}
