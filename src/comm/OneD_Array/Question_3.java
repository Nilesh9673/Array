package comm.OneD_Array;
//when one element is 3 start adding three and add till we get another three  Exculding 3;

public class Question_3 {
	public static void main(String[] args) {
		int a[]= {7,-2,8,3,9,16,-2,10,3,5,30};
		int sum=0;
		boolean x=false;
		for(int i=0;i<a.length;i++)
		{
			if(x)
			{
				sum=sum+a[i];
				if(a[i]==3)
				{
					x=false;
				}
				
			}else if(a[i]==3)
			{x=true;
				
			}
		}
		System.out.println(sum);
	}
}
