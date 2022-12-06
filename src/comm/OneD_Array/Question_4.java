package comm.OneD_Array;
// Write a java Program to find the continues positive sum  "solve by my own logic"
public class Question_4 {
	public static void main(String[] args) {
		int a[]= {3,-6,49,6,8,-1,30,4,-12,3,31,-1,50};
		
		int sum=0,max=0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>0)
			{
				sum=sum+a[i];
			}else 
			{
				if(sum>max)
				{
					max=sum;
				}
				sum=0;
			}
				
			}
		if(sum>max)
		{
			max=sum;
		}
		System.out.println(max);
	}
}
