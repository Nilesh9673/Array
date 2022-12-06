package comm.OneD_Array;

public class ReverseOfArray {
	public static void main(String[] args) {
		int a[]=Array.readArray();
		
		Array.displayArray(a);
		
		//Swapping the number till half of an array
		for(int i=0;i<=a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		System.out.println();
		Array.displayArray(a);
	}
}
