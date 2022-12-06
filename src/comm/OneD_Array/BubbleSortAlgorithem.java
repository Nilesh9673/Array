package comm.OneD_Array;
//Algorithm  in shorting algorithm.i.e Accending Order
public class BubbleSortAlgorithem {
	public static void main(String[] args) {
		int a[]= {40,30,90,100,20,10,2,4,50};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])//======> a[j]<a[j+1]---->for descending Order
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		Array.displayArray(a);
	}
}
