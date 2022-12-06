package comm.OneD_Array;

import java.util.Scanner;

public class DeleteElement {
	public static void deleteElement(int a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index");
		int index=sc.nextInt();
		if(index<0 || index>a.length-1)
		{
			System.out.println("index should be positive and less then Array length");
			return ;
		}
		int b[]=new int [a.length-1];
		for(int i=0;i<b.length;i++)
		{
			if(i<index)
			{
				b[i]=a[i];
			}else
			{
				b[i]=a[i+1];
			}
		}Array.displayArray(b);
	}
	
	public static void main(String[] args) {
		int a[]=Array.readArray();
		Array.displayArray(a);
		deleteElement(a);
	}
}
