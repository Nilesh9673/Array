package comm.OneD_Array;

public class PerfectNumberInArray {

	//method for Perfect Number
	public static boolean isPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum==n;
	}
	
	public static void main(String[] args) {
		int []a=Array.readArray();
		for(int i=0;i<a.length;i++)
		{
			if(isPerfect(a[i]))
			{
				System.out.println(a[i]);
			}
		}
	}
}
