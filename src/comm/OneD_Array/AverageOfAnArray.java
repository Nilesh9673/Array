package comm.OneD_Array;

public class AverageOfAnArray {
	public static void main(String[] args) {
		int []a=Array.readArray();
		double sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("average of an Arraay is "+(sum/a.length));
	}
}
