package comm.OneD_Array;
/*
 * write a java program to add array element once if you get 3 till you get another 3;
 */
public class ArrayQuestion {
	public static void main(String[] args) 
	{
		int a[]= {7,-2,8,3,9,16,-2,10,3,5,3};
		int sum=0;
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==3)
			{
				c++;
			}
			if(c==1) {
				sum=sum+a[i];
			}
			if(c==2)
			{
				sum=sum+a[i];
				break;
			}
		}
		System.out.println(sum);
	}
}
